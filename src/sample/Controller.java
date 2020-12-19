package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class Controller {
    String[] words = {"apple", "orange", "lemon",
    "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
    "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
    "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    GuessWord guessWord = new GuessWord(words);

    @FXML
    private TextField textField;

    @FXML
    private Label headerName;
    private Random random;

    @FXML
    public void guess() {
      guessWord.setUserWord(textField.getText());
      headerName.setText(guessWord.compare());
    }
    @FXML
    public void reset(){
        headerName.setText("Правильное слово " + guessWord.getRandomWord() + "\n угадайте новое слово");
        guessWord.setRandomWord(words);
    };
}
