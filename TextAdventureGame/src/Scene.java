// Scene.java
public interface Scene {
    /**
     * シーンを実行し、次のシーンのIDを返す
     */
    String play(GameContext context);
}
