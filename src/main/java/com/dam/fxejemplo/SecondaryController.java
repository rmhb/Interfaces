package com.dam.fxejemplo;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    @FXML
    private void switchToOther() throws IOException {
        App.setRoot("otherWindow");
    }
    
}