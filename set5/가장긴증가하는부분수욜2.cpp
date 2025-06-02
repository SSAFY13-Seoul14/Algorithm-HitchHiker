#include <iostream>
#include <vector>

using namespace std;

int main() {
    int n;
    vector<int> arr;
    vector<int> dp;
    vector<int> minVal;
    cin>>n;

    for(int i=0; i<n; i++) {
        int num;
        cin>>num;
        arr.push_back(num);
        dp.push_back(0);
        minVal.push_back(0);
    }

    dp[n-1] = 1;
    minVal[n-1] = arr[n-1];

    for(int i=n-2; i>=0; i--) {
        if(arr[i] < arr[i+1] && minVal[i+1] > arr[i]) {
            dp[i] = dp[i+1] + 1;
            minVal[i] = arr[i];
        } else if(minVal[i+1] >= arr[i] && arr[i] < arr[i+1]) {
            dp[i] = dp[i+1];
            minVal[i] = minVal[i+1];
        } else {
            dp[i] = dp[i+1];
            minVal[i] = minVal[i+1];
        } 
    }

    for(int i=0; i<n; i++) {
        cout<<dp[i]<<" ";
    }
    cout<<endl;

    cout<<dp[0]<<endl;
}