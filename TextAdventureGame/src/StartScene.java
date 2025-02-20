public class StartScene implements Scene {
    @Override
    public String play(GameContext context) {
        System.out.println("=== プロローグ ===");
        System.out.println("あなたは見知らぬ森の中の小さな開けた場所で目を覚まします。");
        System.out.println("霧が立ちこめ、かすかな鐘の音がどこからか響いています。");
        System.out.println("周囲を見渡すと、3つの道が見えます。");
        System.out.println("1. 茂みの奥へと続く暗い森の道");
        System.out.println("2. 遠くにそびえる山へと向かう細い道");
        System.out.println("3. 小さな町へと続く石畳の道");
        System.out.print("どの道を選びますか？ (1/2/3): ");

        String choice = context.getScanner().nextLine();
        switch (choice) {
            case "1":
                return "forest";
            case "2":
                return "mountain";
            case "3":
                return "town";
            default:
                System.out.println("無効な入力です。再度選択してください。");
                return "start";
        }
    }
}
