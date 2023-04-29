import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.OwnerWebConfigRunner;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class TestBase {

    private static final Logger logger = LoggerFactory.getLogger(TestBase.class);

    private static String executionMode;

    @BeforeAll
    static void setUp() {
        // Для аллюр отчета
        SelenideLogger.addListener("allure", new AllureSelenide());

        new OwnerWebConfigRunner().runWebConfig();
    }


    @AfterEach
    void addAttachments() {
/*        Attach.screenshotAs("Last screen");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        if (executionMode.equals("remote")) {
            Attach.addVideo();
        }
		*/
    }

}