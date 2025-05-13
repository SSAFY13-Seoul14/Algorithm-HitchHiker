from collections import deque

N, M = map(int, input().split())
ADJ = [{} for _ in range(N)]

for _ in range(M):
    A, B, C = map(int, input().split())
    ADJ[A-1][B-1] = C
    ADJ[B-1][A-1] = C

S, E = map(int, input().split())
S -= 1
E -= 1

# Parametric Search
s = 1
e = 1000000001
m = (s + e) // 2

while not s + 1 == e:
    # BFS
    visit = [False for _ in range(N)]
    visit[S] = True
    q = deque([S])
    flag = True

    while q:
        v = q.popleft()

        for nv in ADJ[v]:
            if visit[nv]: continue
            if ADJ[v][nv] < m: continue

            q.append(nv)
            visit[nv] = True

    if not visit[E]:
        e = m
    else:
        s = m

    m = (s + e) // 2

print(s)
