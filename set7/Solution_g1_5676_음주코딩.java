package set7;

import java.io.*;
import java.util.*;
public class Solution_g1_5676_음주코딩 {
    static int N,K;
    static int[] arr,tree;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line ;

        while ((line=br.readLine())!=null) {
            if(line.isEmpty())
                break;
            StringTokenizer st = new StringTokenizer(line);
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            arr = new int[N+1];
            st = new StringTokenizer(br.readLine());
            for(int i=1;i<=N;i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            tree=new int[N*4];

            makeTree(1, N , 1);
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                String cmd=st.nextToken();
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                if (cmd.equals("C")) {
                    update(1,N,1,a,b);
                }
                else { //P
                    int num=query(1, N, 1, a, b);
                    if(num==1)
                        sb.append("+");
                    else if(num==-1)
                        sb.append("-");
                    else
                        sb.append("0");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    private static int makeTree(int start, int end, int nIdx) {
        if(start==end){
            return tree[nIdx] = setSign(arr[start]);
        }
        int mid=(start+end)/2;
        return tree[nIdx] = makeTree(start, mid, nIdx * 2) * makeTree(mid + 1, end, nIdx * 2 + 1);
    }

    private static int query(int start, int end, int nIdx, int left, int right) {
        if (end < left || start > right) {
            return 1;
        }
        else if (left <= start && end <= right) {
            return tree[nIdx];
        }
        int mid=(start+end)/2;
        return query(start, mid, nIdx * 2, left, right) * query(mid + 1, end, nIdx * 2 + 1, left, right);
    }

    private static int update(int start, int end, int nIdx, int idx, int value) {
        if (start == end && end == idx) {
            arr[idx]=value;
            return tree[nIdx] = setSign(value);
        }
        else if(idx>end || idx<start){
            return tree[nIdx];
        }
        int mid=(start+end)/2;
        return tree[nIdx] = update(start, mid, nIdx * 2, idx, value)
                * update(mid + 1, end, nIdx * 2 + 1, idx, value);
    }

    private static int setSign(int num) {
        int ret=0;
        if(num>0)
            ret=1;
        else if(num<0)
            ret=-1;
        return ret;
    }
}
