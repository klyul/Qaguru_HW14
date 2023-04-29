import com.codeborne.selenide.logevents.SelenideLogger;
import config.OwnerWebConfigRunner;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void setUp() {
        // Для аллюр отчета
        SelenideLogger.addListener("allure", new AllureSelenide());

        new OwnerWebConfigRunner().runWebConfig();
    }


