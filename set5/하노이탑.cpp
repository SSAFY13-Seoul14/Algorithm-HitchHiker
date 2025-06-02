#include <iostream>
#include <algorithm>
#include <cstring>
#include <vector>

using namespace std;

int n;
long long answer;
vector<pair<int, int>> path;

long long hanoi(int from, int to, int mid, int cnt);

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);

    cin>>n;

    answer = hanoi(1, 3, 2, n);

    cout<<answer<<"\n";

    for(int i = 0; i<path.size(); i++) {
        cout<<path[i].first<<" "<<path[i].second<<"\n";
    }
}

long long hanoi(int from, int to, int mid, int cnt) {
    long long count = 0;
    if(cnt == 1) {
        path.push_back({from, to});
        return 1;
    }

    count += hanoi(from, mid, to, cnt -1);
    count += 1;
    path.push_back({from, to});
    count += hanoi(mid, to, from, cnt -1);

    return count;
}