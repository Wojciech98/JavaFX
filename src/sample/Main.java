package sample;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void init() throws Exception {
        super.init();
        // inicjalizowanie danych do aplikacji
        System.out.println("before start");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        Label label = new Label("asdasdasd");

        // glowny kontener z kolumnami i z wierszami
        GridPane root = new GridPane();

        // wyrownywanie elementu w kontenerze
        root.setAlignment(Pos.CENTER);

        // marginesy wewnetrzne dla kazdego boku razem
        root.setPadding(new Insets(10));
        // dla kazdego boku osobno
        root.setPadding(new Insets(10, 5, 10, 5));
        // odstep miedzy kolumnami
        root.setHgap(10);
        // odstep miedzy wierszami
        root.setVgap(5);

        // 1 - element, 2 - nr. kolumny, 3 - nr. wiersza
        root.add(label, 0, 0);
        // 4 - colspan (na ile kolumn ma sie rozciagac)
        // 5 - rowspan (na ile wierszy ma sie rozciagac)
        root.add(new Label("1231231231212312312313131"), 0, 1, 3, 1);
        root.add(new Label("11"), 0, 2);
        root.add(new Label("22"), 1, 2);
        root.add(new Label("33"), 2, 2);

        // ograniczenia kolumn - minimalna szerokosc, domyslna szerokosc, maksymalna szerokosc
        ColumnConstraints constraints1 = new ColumnConstraints(100, 200, 200);
        constraints1.setHalignment(HPos.LEFT);
        ColumnConstraints constraints2 = new ColumnConstraints(100, 200, 200);
        ColumnConstraints constraints3 = new ColumnConstraints(100, 200, Double.MAX_VALUE);
        constraints3.setHalignment(HPos.RIGHT);

        root.getColumnConstraints()
            .addAll(constraints1, constraints2, constraints3);

        for (int x = 1; x < 6; x++) { // kolumny
            for (int y = 1; y < 6; y++) { // wiersze
                root.add(new Label("asd" + x + y), x, y);
            }
        }
        root.add(new Label("Heder1ascascascasc"), 0, 0, 3, 1);
        root.add(new Label("Heder2ascascascasc"), 3, 0, 3, 1);
        root.add(new Label("COLMUN\nascascasc\nascascasc\nascascasc\nascascasc"),
            0, 1, 1, 5);


        primaryStage.setTitle("Application");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        // finalizowanie aplikacji
        System.out.println("after closing window");
    }
}
