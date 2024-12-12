
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class CalendarUIFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Sidebar
        VBox sidebar = new VBox();
        sidebar.setSpacing(20);
        sidebar.setPadding(new Insets(20));
        sidebar.setStyle("-fx-background-color: #f0f0f0;");

        Label logo = new Label("LOGO");
        logo.setStyle("-fx-font-size: 20px; -fx-font-weight: bold;");

        Button dashboardButton = new Button("Admin Dashboard");
        Button viewAllButton = new Button("View All");
        Button newForm1Button = new Button("New Form 1");
        Button newForm2Button = new Button("New Form 2");
        Button logoutButton = new Button("Logout");

        sidebar.getChildren().addAll(logo, dashboardButton, viewAllButton, newForm1Button, newForm2Button, logoutButton);

        // Main Content
        VBox mainContent = new VBox();
        mainContent.setPadding(new Insets(20));
        mainContent.setSpacing(20);

        Label titleLabel = new Label("Cable Network");
        titleLabel.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10));
        grid.setStyle("-fx-background-color: #f5f5f5;");

        // Add buttons for dates 1-30
        for (int i = 1; i <= 30; i++) {
            Button dateButton = new Button(String.valueOf(i));
            dateButton.setStyle(
                "-fx-background-color: #228B22; -fx-text-fill: white; -fx-font-size: 16px; -fx-font-weight: bold;");
            dateButton.setPrefSize(60, 60);
            grid.add(dateButton, (i - 1) % 6, (i - 1) / 6); // Place buttons in a 6-column grid
        }

        mainContent.getChildren().addAll(titleLabel, grid);

        // Root Layout
        BorderPane root = new BorderPane();
        root.setLeft(sidebar);
        root.setCenter(mainContent);

        // Scene
        Scene scene = new Scene(root, 800, 600);

        // Apply CSS file
        scene.getStylesheets().add("styles.css");

        // Stage
        primaryStage.setTitle("Cable Network");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
