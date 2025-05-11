package set5;

import java.io.*;
import java.util.*;
public class Solution_g3_1939_중량제한 {
    static int n,m,fac1,fac2;
    static List<Map<Integer, Integer>> adj;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        n=Integer.parseInt(st.nextToken());
        m=Integer.parseInt(st.nextToken());
         adj = new ArrayList<>();
        for(int i=0;i<=n;i++)
            adj.add(new HashMap<>());
        int start=Integer.MAX_VALUE, end=0;
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            int c=Integer.parseInt(st.nextToken());
            start = Math.min(start, c); //후처리로 인해 실제 다리와 값이 같지 않을 수 있지만 크게 상관 없음
            end = Math.max(end, c);
            Map<Integer, Integer> A,B;
            A=adj.get(a); B=adj.get(b);

            // 두 지점 사이에 여러 다리가 존재하는 경우
            // 가장 큰 무게를 견딜 수 있는 다리만 남겨놓는다
            A.put(b,Math.max(A.getOrDefault(b,0),c));
            B.put(a,Math.max(B.getOrDefault(a,0),c));
        }
        st = new StringTokenizer(br.readLine());
        fac1=Integer.parseInt(st.nextToken());
        fac2=Integer.parseInt(st.nextToken());


        // 중량을 조정해가며 fac1에서 fac2로 이동가능한지 판별한다
        // 현재 중량에서 fac1 -> fac2 로 이동할 수 있다면 중량을 늘려보고
        // 이동할 수 없다면 중량을 줄인다
        // 중량을 줄일 때는 이분 탐색을 통해 중량을 조정해나간다
        int answer=0;
        while(start<=end){
            int mid=(start+end)/2;
            if(bfs(mid)){ // 해당 중량으로 fac1-> fac2 로 이동할 수 있다면 중량을 늘린다
                answer=mid;
                start=mid+1;
            }
            else
                end=mid-1;
        }
        System.out.println(answer);
    }
    private static boolean bfs(int weight){
        Queue<Integer> q=new ArrayDeque<>();
        boolean[] visited=new boolean[n+1];
        visited[fac1]=true;
        q.add(fac1);
        while(!q.isEmpty()){
            int cur = q.poll();
            if(cur==fac2)
                return true;
            for(Map.Entry<Integer,Integer> e: adj.get(cur).entrySet()){
                int next=e.getKey();
                int nweight=e.getValue();
                if(!visited[next] && nweight>=weight ){
                    q.offer(next);
                    visited[next]=true;
                }
            }
        }
        return false;
    }
}
