import heapq
from math import inf

N, M = map(int, input().split())
ADJ = [list() for _ in range(N)]

for _ in range(M):
    A, B, C = map(int, input().split())
    ADJ[A-1].append((B-1, C))
    ADJ[B-1].append((A-1, C))

S, E = map(int, input().split())
S -= 1
E -= 1


limits = [0.0 for _ in range(N)]
limits[S] = inf

pq = [(-inf, S)]

while pq:
    limit, v = heapq.heappop(pq)
    limit = -limit

    if v == E:
        print(limit)
        break

    for nv, nl in ADJ[v]:
        cmp_l = min(limit, nl)

        if cmp_l > limits[nv]:
            limits[nv] = cmp_l
            heapq.heappush(pq, (-cmp_l, nv))

