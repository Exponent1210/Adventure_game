public class TownScene implements Scene {
    @Override
    public String play(GameContext context) {
        System.out.println("\n=== 小さな町 ===");
        System.out.println("石畳の道を進むと、こぢんまりとした町の広場に出ます。");
        System.out.println("市場は活気にあふれ、行商人が珍しい品を売っています。");
        System.out.println("あなたは周囲を見回し、どう行動するか考えます。");
        System.out.println("1. 行商人に話しかけてみる");
        System.out.println("2. 村長の家に行って情報を集める");
        System.out.println("3. 来た道を戻る");
        System.out.print("選択肢 (1/2/3): ");

        String choice = context.getScanner().nextLine();
        switch (choice) {
            case "1":
                System.out.println("行商人はあなたに不思議な薬を差し出してきた。");
                System.out.println("どうやら体力を回復する薬らしい…。");
                context.getPlayer().addItem("回復薬");
                System.out.println("アイテム「回復薬」を手に入れた！");
                return "town";

            case "2":
                System.out.println("村長は森の奥にある『古代遺跡』について語りだしました。");
                System.out.println("さらなる冒険への手がかりを得たかもしれません。");
                System.out.println("（今はまだ実装されていませんが、追加シーンを作っても面白いでしょう！）");
                return "town";

            case "3":
                System.out.println("来た道を引き返し、スタート地点へ戻ります。");
                return "start";

            default:
                System.out.println("無効な入力です。もう一度選択してください。");
                return "town";
        }
    }
}
