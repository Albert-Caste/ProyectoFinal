module co.edu.uniquindio.ejercicio1javafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.ejercicio1javafx to javafx.fxml;
    exports co.edu.uniquindio.ejercicio1javafx;
    exports co.edu.uniquindio.ejercicio1javafx.viewController;
    opens co.edu.uniquindio.ejercicio1javafx.viewController to javafx.fxml;

}
