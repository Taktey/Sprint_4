public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        boolean isStringLengthCorrect = name.length() <= 19 && name.length() >= 3;
        boolean isSingleGap = name.split("\\s").length == 2;
        boolean isGapNotAtBeginning=false;
        if (name.length()!=0){
            isGapNotAtBeginning = name.charAt(0) != ' ' && name.charAt(name.length() - 1) != ' ';
        }
        return isStringLengthCorrect && isSingleGap && isGapNotAtBeginning;
        /*
             Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
             Если строка удовлетворяет условиям, метод возвращает true, иначе — false.
         */
    }

}