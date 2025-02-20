public class MountainScene implements Scene {
    @Override
    public String play(GameContext context) {
        System.out.println("\n=== 山の道 ===");
        System.out.println("ごつごつとした岩道を登っていくと、冷たい風が肌を刺します。");
        System.out.println("途中、古い山小屋を見つけますが、中から大きな獣の唸り声が聞こえてきました。");
        System.out.println("どうしますか？");
        System.out.println("1. 山小屋に入り、獣を探す");
        System.out.println("2. 山小屋を避けて、さらに山頂へ向かう");
        System.out.println("3. 来た道を戻る");
        System.out.print("選択肢 (1/2/3): ");

        String choice = context.getScanner().nextLine();
        switch (choice) {
            case "1":
                System.out.println("山小屋の扉を開けると、中から大きな熊が姿を現し、襲ってきた！");
                // プレイヤーの体力を減らす
                int newHealth = context.getPlayer().getHealth() - 20;
                context.getPlayer().setHealth(newHealth);
                System.out.println("なんとか逃げ出すことに成功したが、体力を 20 失った…");
                System.out.println("現在の体力: " + context.getPlayer().getHealth());
                // もし体力が0以下ならゲームオーバーにするなどの処理も
                if (context.getPlayer().getHealth() <= 0) {
                    System.out.println("体力が尽きて倒れてしまった…ゲームオーバー。");
                    return "end";
                }
                System.out.println("あなたは急いで山道を下り、スタート地点へ戻ってきた。");
                return "start";

            case "2":
                System.out.println("険しい岩場を乗り越え、山頂にたどり着くと、");
                System.out.println("そこには伝説のドラゴンが眠っていた…！");
                System.out.println("ドラゴンはあなたに気づくことなく眠り続けている。");
                System.out.println("ひとまず命が危険なので、スタート地点へ引き返すことにした。");
                return "start";

            case "3":
                System.out.println("来た道を引き返し、スタート地点へ戻ります。");
                return "start";

            default:
                System.out.println("無効な入力です。もう一度選択してください。");
                return "mountain";
        }
    }
}
