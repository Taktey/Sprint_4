import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountParameterizedTest {
    private String name;
    private boolean expected;

    public AccountParameterizedTest(String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "name= {0}, expected result= {1}")
    public static Object[][] getData() {
        return new Object[][]{
                {"Paul Kozlovskiy", true},
                {"Paul  Kozlovskiy", false},
                {"Paul  Kozlovs kiy", false},
                {"Paul KozlovskiyKozlo", false},
                {"qw", false},
                {"qw ", false},
                {"Pail_Kozlovskiy", false},
                {" Paul Kozlovskiy", false},
                {"Paul Kozlovskiy ", false},
                {"PaulKozlovskiy ", false},
                {" PaulKozlovskiy", false},
        };
    }

    @Test
    public void isCheckNameToEmbossReturnsCorrectBoolean() {
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        Assert.assertEquals(expected, actual);
    }
}