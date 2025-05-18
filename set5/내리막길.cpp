#include<iostream>
#include<algorithm>
#include<vector>
#include <stack>

using namespace std;

//dp의미 -> 현재 위치에서 목표 지점까지 갈 수 있는 방법 수
//따라서 다음 이동 지점의 가능한 가짓수 + 현재 지점의 가능한 가짓수  = 현재 지점의 가능한 가짓수
int dx[4] = {1, -1, 0, 0};
int dy[4] = {0, 0, 1, -1};
int n, m;
long long board[501][501];
long long possible[501][501];

long long dfs(int x, int y);

int main() {
    cin>>n>>m;

    for(int i=0; i<n; i++) {
        for(int j=0; j<m; j++) {
            cin>>board[i][j];
            possible[i][j] = -1;
        }
    }

    cout<<dfs(0, 0)<<endl;
}

long long dfs(int x, int y) {
    if(x == n-1 && y == m-1) return 1;
    if(possible[x][y] != -1) return possible[x][y];

    possible[x][y] = 0;

    for(int i=0; i<4; i++) {
        int nx = x + dx[i];
        int ny = y + dy[i];

        if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;
        if(board[nx][ny] >= board[x][y]) continue;

        possible[x][y] += dfs(nx, ny);
    }

    return possible[x][y];
}