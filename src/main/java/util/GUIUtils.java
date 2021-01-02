package util;

import javafx.application.Platform;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class GUIUtils
{
    public static void runSafe(Runnable runnable) {
        if (Platform.isFxApplicationThread()) {
            runnable.run();
        }
        else {
            Platform.runLater(runnable);
        }
    }

    public static void runAsync(Runnable runnable) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(runnable);
    }

}
