package set5.no1717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int n, m;
    public static int[] parents;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        parents = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {
            parents[i] = i;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            switch (cmd) {
                case "0":
                    union(v1, v2);
                    break;
                case "1":
                    v1 = find(v1);
                    v2 = find(v2);
                    String answer = v1 == v2 ? "YES\n" : "NO\n";
                    sb.append(answer);
                    break;
            }
        }

        System.out.print(sb);
        br.close();
    }

    public static int find(int x) {
        if (parents[x] != x) {
            parents[x] = find(parents[x]);
        }
        return parents[x];
    }

    public static void union(int a, int b) {
        a = find(a);
        b = find(b);

        if (a < b) parents[a] = b;
        else parents[b] = a;
    }
}