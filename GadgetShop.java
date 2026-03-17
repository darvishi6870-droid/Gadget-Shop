import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.util.ArrayList;

public class GadgetShop extends Application
{
    private final TextField modelField = new TextField();
    private final TextField priceField = new TextField();
    private final TextField weightField = new TextField();
    private final TextField sizeField = new TextField();

    private final TextField creditField = new TextField();
    private final TextField memoryField = new TextField();

    private final TextField phoneField = new TextField();
    private final TextField durationField = new TextField();
    private final TextField downloadField = new TextField();

    private final TextField displayNumberField = new TextField();

    private final TextArea logArea = new TextArea();

    private final ArrayList<Gadget> gadgets = new ArrayList<>();

    @Override
    public void start(Stage stage)
    {
        Pane root = new Pane();

        Label modelLabel = new Label("Model:");
        modelLabel.setLayoutX(20);
        modelLabel.setLayoutY(20);
        modelField.setLayoutX(140);
        modelField.setLayoutY(20);
        modelField.setPrefWidth(140);

        Label priceLabel = new Label("Price:");
        priceLabel.setLayoutX(20);
        priceLabel.setLayoutY(50);
        priceField.setLayoutX(140);
        priceField.setLayoutY(50);
        priceField.setPrefWidth(140);

        Label weightLabel = new Label("Weight:");
        weightLabel.setLayoutX(20);
        weightLabel.setLayoutY(80);
        weightField.setLayoutX(140);
        weightField.setLayoutY(80);
        weightField.setPrefWidth(140);

        Label sizeLabel = new Label("Size:");
        sizeLabel.setLayoutX(20);
        sizeLabel.setLayoutY(110);
        sizeField.setLayoutX(140);
        sizeField.setLayoutY(110);
        sizeField.setPrefWidth(140);

        Label creditLabel = new Label("Credit:");
        creditLabel.setLayoutX(20);
        creditLabel.setLayoutY(140);
        creditField.setLayoutX(140);
        creditField.setLayoutY(140);
        creditField.setPrefWidth(140);

        Label memoryLabel = new Label("Memory:");
        memoryLabel.setLayoutX(20);
        memoryLabel.setLayoutY(170);
        memoryField.setLayoutX(140);
        memoryField.setLayoutY(170);
        memoryField.setPrefWidth(140);

        Label phoneLabel = new Label("Phone Number:");
        phoneLabel.setLayoutX(20);
        phoneLabel.setLayoutY(200);
        phoneField.setLayoutX(140);
        phoneField.setLayoutY(200);
        phoneField.setPrefWidth(140);

        Label durationLabel = new Label("Duration:");
        durationLabel.setLayoutX(20);
        durationLabel.setLayoutY(230);
        durationField.setLayoutX(140);
        durationField.setLayoutY(230);
        durationField.setPrefWidth(140);

        Label downloadLabel = new Label("Download Size:");
        downloadLabel.setLayoutX(20);
        downloadLabel.setLayoutY(260);
        downloadField.setLayoutX(140);
        downloadField.setLayoutY(260);
        downloadField.setPrefWidth(140);

        Label displayNumberLabel = new Label("Display Number:");
        displayNumberLabel.setLayoutX(20);
        displayNumberLabel.setLayoutY(290);
        displayNumberField.setLayoutX(140);
        displayNumberField.setLayoutY(290);
        displayNumberField.setPrefWidth(140);

        Button addMobileButton = new Button("Add Mobile");
        addMobileButton.setLayoutX(320);
        addMobileButton.setLayoutY(40);
        addMobileButton.setPrefWidth(120);

        Button addMP3Button = new Button("Add MP3");
        addMP3Button.setLayoutX(450);
        addMP3Button.setLayoutY(40);
        addMP3Button.setPrefWidth(120);

        Button clearButton = new Button("Clear");
        clearButton.setLayoutX(320);
        clearButton.setLayoutY(90);
        clearButton.setPrefWidth(120);

        Button displayAllButton = new Button("Display All");
        displayAllButton.setLayoutX(450);
        displayAllButton.setLayoutY(90);
        displayAllButton.setPrefWidth(120);

        Button makeCallButton = new Button("Make a Call");
        makeCallButton.setLayoutX(320);
        makeCallButton.setLayoutY(140);
        makeCallButton.setPrefWidth(120);

        Button downloadMusicButton = new Button("Download Music");
        downloadMusicButton.setLayoutX(450);
        downloadMusicButton.setLayoutY(140);
        downloadMusicButton.setPrefWidth(120);

        logArea.setLayoutX(20);
        logArea.setLayoutY(340);
        logArea.setPrefWidth(550);
        logArea.setPrefHeight(180);
        logArea.setEditable(false);

        addMobileButton.setOnAction(e -> addMobile());
        addMP3Button.setOnAction(e -> addMP3());
        clearButton.setOnAction(e -> clearFields());
        displayAllButton.setOnAction(e -> displayAll());
        makeCallButton.setOnAction(e -> makeCall());
        downloadMusicButton.setOnAction(e -> downloadMusic());

        root.getChildren().addAll(
            modelLabel, modelField,
            priceLabel, priceField,
            weightLabel, weightField,
            sizeLabel, sizeField,
            creditLabel, creditField,
            memoryLabel, memoryField,
            phoneLabel, phoneField,
            durationLabel, durationField,
            downloadLabel, downloadField,
            displayNumberLabel, displayNumberField,
            addMobileButton, addMP3Button,
            clearButton, displayAllButton,
            makeCallButton, downloadMusicButton,
            logArea
        );

        Scene scene = new Scene(root, 600, 550);
        stage.setTitle("GadgetShop");
        stage.setScene(scene);
        stage.show();
    }

    private void addMobile()
    {
        try {
            String model = modelField.getText().trim();
            double price = Double.parseDouble(priceField.getText().trim());
            int weight = Integer.parseInt(weightField.getText().trim());
            String size = sizeField.getText().trim();
            int credit = Integer.parseInt(creditField.getText().trim());

            Mobile mobile = new Mobile(model, price, weight, size, credit);
            gadgets.add(mobile);

            logArea.appendText("Added Mobile at index " + (gadgets.size() - 1) + ": " + mobile + "\n");
        }
        catch (Exception ex) {
            logArea.appendText("Error adding Mobile. Check model, price, weight, size and credit.\n");
        }
    }

    private void addMP3()
    {
        try {
            String model = modelField.getText().trim();
            double price = Double.parseDouble(priceField.getText().trim());
            int weight = Integer.parseInt(weightField.getText().trim());
            String size = sizeField.getText().trim();
            int memory = Integer.parseInt(memoryField.getText().trim());

            MP3 mp3 = new MP3(model, price, weight, size, memory);
            gadgets.add(mp3);

            logArea.appendText("Added MP3 at index " + (gadgets.size() - 1) + ": " + mp3 + "\n");
        }
        catch (Exception ex) {
            logArea.appendText("Error adding MP3. Check model, price, weight, size and memory.\n");
        }
    }

    private void clearFields()
    {
        modelField.clear();
        priceField.clear();
        weightField.clear();
        sizeField.clear();
        creditField.clear();
        memoryField.clear();
        phoneField.clear();
        durationField.clear();
        downloadField.clear();
        displayNumberField.clear();

        logArea.appendText("All input fields cleared.\n");
    }

    private void displayAll()
    {
        if (gadgets.size() == 0) {
            logArea.appendText("No gadgets stored.\n");
            return;
        }

        logArea.appendText("----- All Gadgets -----\n");
        for (int i = 0; i < gadgets.size(); i++) {
            logArea.appendText(i + ": " + gadgets.get(i) + "\n");
        }
        logArea.appendText("-----------------------\n");
    }

    private int getDisplayNumber()
    {
        int displayNumber = -1;

        try {
            displayNumber = Integer.parseInt(displayNumberField.getText().trim());

            if (displayNumber < 0 || displayNumber >= gadgets.size()) {
                logArea.appendText("Error: Display number is out of range.\n");
                return -1;
            }
        }
        catch (Exception ex) {
            logArea.appendText("Error: Display number must be an integer.\n");
            return -1;
        }

        return displayNumber;
    }

    private void makeCall()
    {
        int displayNumber = getDisplayNumber();
        if (displayNumber == -1) {
            return;
        }

        Gadget selectedGadget = gadgets.get(displayNumber);

        if (!(selectedGadget instanceof Mobile)) {
            logArea.appendText("Error: Selected gadget is not a Mobile.\n");
            return;
        }

        try {
            String phoneNumber = phoneField.getText().trim();
            int duration = Integer.parseInt(durationField.getText().trim());

            Mobile mobile = (Mobile) selectedGadget;
            mobile.makeCall(phoneNumber, duration);

            logArea.appendText("Call attempted on Mobile at index " + displayNumber + ".\n");
        }
        catch (Exception ex) {
            logArea.appendText("Error: Check phone number and duration.\n");
        }
    }

    private void downloadMusic()
    {
        int displayNumber = getDisplayNumber();
        if (displayNumber == -1) {
            return;
        }

        Gadget selectedGadget = gadgets.get(displayNumber);

        if (!(selectedGadget instanceof MP3)) {
            logArea.appendText("Error: Selected gadget is not an MP3.\n");
            return;
        }

        try {
            int downloadSize = Integer.parseInt(downloadField.getText().trim());

            MP3 mp3 = (MP3) selectedGadget;
            mp3.downloadMusic(downloadSize);

            logArea.appendText("Download attempted on MP3 at index " + displayNumber + ".\n");
        }
        catch (Exception ex) {
            logArea.appendText("Error: Check download size.\n");
        }
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}