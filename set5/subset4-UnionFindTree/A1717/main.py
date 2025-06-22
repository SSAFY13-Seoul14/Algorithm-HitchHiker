n, m = map(int, input().split())
parents = [i for i in range(n + 1)]


def find(a):
    if a == parents[a]:
        return a

    parents[a] = find(parents[a])
    return parents[a]


def union(a, b):
    a = find(a)
    b = find(b)

    parents[b] = a
    print(parents)


for _ in range(m):
    cmd, a, b = map(int, input().split())

    if cmd == 0:
        union(a, b)
    elif cmd == 1:
        print("YES" if find(a) == find(b) else "NO")
