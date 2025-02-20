public class ForestScene implements Scene {
    @Override
    public String play(GameContext context) {
        System.out.println("\n=== 森の道 ===");
        System.out.println("深い森の中に足を踏み入れると、背の高い木々が視界を遮ります。");
        System.out.println("やがて苔むした神秘的な泉を見つけました。");
        System.out.println("泉のそばには古びた木製の宝箱が置かれています。");
        System.out.println("どうしますか？");
        System.out.println("1. 宝箱を開けてみる");
        System.out.println("2. 先へ進む");
        System.out.println("3. 来た道を戻る");
        System.out.print("選択肢 (1/2/3): ");

        String choice = context.getScanner().nextLine();
        switch (choice) {
            case "1":
                System.out.println("宝箱を開けると、中には神秘的な輝く石が入っています。");
                System.out.println("石を手に入れた！体力が10回復した気がする！");
                // プレイヤーの体力を回復
                int newHealth = context.getPlayer().getHealth() + 10;
                context.getPlayer().setHealth(newHealth);
                System.out.println("現在の体力: " + context.getPlayer().getHealth());
                // 泉の奥へ進むストーリーに切り替えるなど可能
                return "forest"; // ここでは同じシーンに戻して簡単にしています

            case "2":
                System.out.println("森を抜けると、再び分かれ道へ戻ってきました。");
                return "start";

            case "3":
                System.out.println("来た道を引き返し、スタート地点へ戻ります。");
                return "start";

            default:
                System.out.println("無効な入力です。もう一度選択してください。");
                return "forest";
        }
    }
}
