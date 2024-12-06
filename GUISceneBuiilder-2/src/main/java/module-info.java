module guiscenebuilder.guiscenebuiilder2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens guiscenebuilder.guiscenebuiilder2 to javafx.fxml;
    exports guiscenebuilder.guiscenebuiilder2;
}