import sys
from functools import lru_cache

sys.setrecursionlimit(10**6)

N = int(input())
A = list(map(int, input().split()))


@lru_cache
def dfs(idx):
    if idx == N - 1:
        return 1

    if A[idx] < A[idx + 1]:
        return dfs(idx + 1) + 1
    else:
        return dfs(idx + 1)


answer = 0
for i in range(N):
    answer = max(answer, dfs(i))

print(answer)

