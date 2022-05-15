public class Praktikum {

    public static void main(String[] args) {
        String name = args[0];
        Account account = new Account(name);
        boolean isNameValid = account.checkNameToEmboss();
        System.out.println(String.format("Имя %s отвечает требованиям: ",name)+ isNameValid);
    }
}