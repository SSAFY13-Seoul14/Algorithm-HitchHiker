#include <iostream>
#include <vector>

using namespace std;

int n, m;
vector<string> answer;
vector<int> parent;

int find(int num);
void child(int a, int b);

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    cout.tie(0);

    cin>>n>>m;

    for(int i=0; i<=n; i++) {
        parent.push_back(i);
    }

    for(int i=0; i<m; i++) {
        int order, a, b;

        cin>>order>>a>>b;

        if(order == 0) {
            child(a, b);
        } else {
            int pa = find(a);
            int pb = find(b);

            if(pa == pb) {
                answer.push_back("yes");
            } else {
                answer.push_back("no");
            }
        }
    }

    for(int i=0; i<answer.size(); i++) {
        cout<<answer[i]<<"\n";
    }
}

int find(int num) {
    if(num == parent[num]) {
        return num;
    }

    parent[num] = find(parent[num]);

    return parent[num];
}

void child(int a, int b) {
    if(parent[a] == parent[b]) {
        return;
    }

    int pa = find(a);
    int pb = find(b);

    if(pa < pb) {
        parent[pb] = pa;
    } else {
        parent[pa] = pb;
    }
}