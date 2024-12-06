import javafx.application.Platform;

public class BackgroundComputation {
    private PlatformRunLaterDemo gui;

    public BackgroundComputation(PlatformRunLaterDemo gui) {
        this.gui = gui;
    }

    public void startComputation() {
        // create a new thread and call
        new Thread(() -> {
            try {
                // This represents a long-running computation
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Platform.runLater(() -> gui.updateBUttonText()); // safe way to update GUI
        }).start();
    }
}
