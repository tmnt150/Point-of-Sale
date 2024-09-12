module point.of.pointofsale {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens point.of.pointofsale to javafx.fxml;
    exports point.of.pointofsale;
}