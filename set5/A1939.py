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


# Dijkstra
limits = [0.0 for _ in range(N)]
limits[S] = inf

pq = [(-inf, S)]

while pq:
    limit, v = heapq.heappop(pq)
    limit = -limit

    # 우선순위 큐에서 중량이 가장 큰 순으로 탐색하기 때문에,
    # 처음으로 도달할 때가 최대 중량 경로임이 보장됨
    if v == E:
        print(limit)
        break

    for nv, nl in ADJ[v]:
        cmp_l = min(limit, nl)  # 최대 중량은 경로상 제한중량의 최솟값

        if cmp_l > limits[nv]:  # 기존의 최대중량보다 크면 갱신
            limits[nv] = cmp_l
            heapq.heappush(pq, (-cmp_l, nv))
