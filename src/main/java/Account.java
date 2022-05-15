public class Account {

    private final String name;
    private char space = ' ';

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (checkLength()) {
            return checkSpaceCount() && checkSpacePosition();
        }
        return false;
    }
    private boolean checkLength() {
        return name != null && name.length() <= 19 && name.length() >= 3;
    }
    private boolean checkSpaceCount() {
        return name.chars().filter(symbol -> symbol == space).count() == 1;
    }
    private boolean checkSpacePosition() {
        return name.charAt(0) != space && name.charAt(name.length() - 1) != space;
    }
}

