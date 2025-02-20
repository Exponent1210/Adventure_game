import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        GameContext context = new GameContext();
        Map<String, Scene> scenes = new HashMap<>();

        // シーンIDと実装クラスを紐付け
        scenes.put("start", new StartScene());
        scenes.put("forest", new ForestScene());
        scenes.put("mountain", new MountainScene());
        scenes.put("town", new TownScene());
        // 終了時には "end" を返すことにします

        String currentScene = "start";
        while (!currentScene.equals("end")) {
            Scene scene = scenes.get(currentScene);
            if (scene == null) {
                System.out.println("不明なシーンです。ゲームを終了します。");
                break;
            }
            currentScene = scene.play(context);
        }
        System.out.println("ゲーム終了。お疲れさまでした！");
    }
}
