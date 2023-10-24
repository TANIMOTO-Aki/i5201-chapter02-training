import java.io.*;

public class EX2_KeyIn {
    public static void main(String[] args) throws IOException {

        /* 入力準備 */
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        /* 出発地点の入力 */
        System.out.print(">出発地：");
        String leave = br.readLine();

        /* 到着地点の入力 */
        System.out.print(">到着地：");
        String arrival = br.readLine();

        /* 結果の表示 */
        System.out.println(leave + "～" + arrival + "を往復します。");
    }
}
