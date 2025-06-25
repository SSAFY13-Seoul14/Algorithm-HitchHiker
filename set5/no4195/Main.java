package set5.no4195;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static int[] parents;
    public static int[] friendsCnt;
    public static Map<String, Integer> friendsMap;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {
            int F = Integer.parseInt(br.readLine());

            parents = new int[F * 2];
            friendsCnt = new int[F * 2];
            friendsMap = new HashMap<>();

            for (int i = 0; i < F * 2; i++) {
                parents[i] = i;
                friendsCnt[i] = 1;
            }

            for (int i = 0; i < F; i++) {
                st = new StringTokenizer(br.readLine());
                int f1 = getFriendId(st.nextToken());
                int f2 = getFriendId(st.nextToken());

                union(f1, f2);

                sb.append(friendsCnt[find(f1)]).append("\n");
            }
        }

        System.out.print(sb);
        br.close();
    }

    public static int getFriendId(String name) {
        if (!friendsMap.containsKey(name)) {
            friendsMap.put(name, friendsMap.size());
        }
        return friendsMap.get(name);
    }

    public static int find(int x) {
        if (x != parents[x]) {
            parents[x] = find(parents[x]);
        }
        return parents[x];
    }

    public static void union(int a, int b) {
        a = find(a);
        b = find(b);

        if (a < b) {
            parents[a] = b;
            friendsCnt[b] += friendsCnt[a];
        }
        else if (a > b) {
            parents[b] = a;
            friendsCnt[a] += friendsCnt[b];
        }
    }

}
