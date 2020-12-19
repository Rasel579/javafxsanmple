package sample;

public class GuessWord {
    private String randomWord;
    private String userWord;

    public void setUserWord(String userWord) {
        this.userWord = userWord;
    }

    public void setRandomWord(String[] words) {
        randomWord = words[(int)(Math.random()*words.length)];
    }

    GuessWord(String[] words){
        randomWord = words[(int)(Math.random()*words.length)];
    }

    public String getRandomWord() {
        return randomWord;
    }

    public String compare(){
      final int SIZE = 15;
      StringBuilder compareWord = new StringBuilder();
      int minLength = Math.min(randomWord.length(), userWord.length());
        for (int i = 0; i < minLength; i++) {
            if(userWord.charAt(i) == randomWord.charAt(i)){
                compareWord.append(randomWord.charAt(i));
            } else {
                compareWord.append("#");
            }
        }
        if(randomWord.equals(compareWord.toString())){
            return "Вы выйграли";
        } else {
            compareWord.append("#".repeat(Math.max(0, SIZE - (compareWord.toString().length() - 1))));
            return compareWord.toString();
        }
    }
}
