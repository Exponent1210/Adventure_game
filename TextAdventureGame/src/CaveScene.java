// CaveScene.java
public class CaveScene implements Scene {
    @Override
    public String play(GameContext context) {
        System.out.println("あなたは洞窟に入ります。");
        System.out.println("洞窟で宝箱を見つけました！");
        // プレイヤーの所持品に宝箱を追加
        context.getPlayer().addItem("宝箱");
        System.out.println("アイテムを入手しました: 宝箱");
        System.out.println("ゲームクリアです。");
        return "end";
    }
}
