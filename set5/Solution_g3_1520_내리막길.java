package set5;

import java.util.*;
import java.io.*;
public class Solution_g3_1520_내리막길 {
    public static int n,m;
    public static int[][] arr,d;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m= Integer.parseInt(st.nextToken());
        arr=new int[n][m];
        d=new int[n][m];
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++)
                arr[i][j]=Integer.parseInt(st.nextToken());
        }
        for(int[] temp: d) Arrays.fill(temp,-1);
        d[n-1][m-1]=1;

        int ret=dfs(0,0);
        System.out.println(ret);
    }
    public static int dfs(int x,int y){
        if(d[x][y]!=-1)
            return d[x][y];
        int[] dx={1,-1,0,0};
        int[] dy={0,0,1,-1};

        int ret=0;
        for(int i=0;i<4;i++){
            int nx=x+dx[i];
            int ny=y+dy[i];
            if(0<=nx && nx<n && 0<=ny && ny<m && arr[nx][ny]<arr[x][y]){
                ret+= dfs(nx,ny);
            }
        }
        d[x][y]=ret;
        return d[x][y];
    }
}
