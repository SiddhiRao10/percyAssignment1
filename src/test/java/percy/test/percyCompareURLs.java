package percy.test;

import org.testng.annotations.Test;

import java.util.Arrays;

public class percyCompareURLs extends BaseTest {


    @Test
    public void snapshotCompare() {
        driver.get(PROD_URL);
        percy.snapshot("/home page",Arrays.asList(375, 480, 720, 1280, 1440, 1920));

        driver.navigate().to(PROD_URL+"/pricing");
        percy.snapshot("/pricing page",Arrays.asList(375, 480, 720, 1280, 1440, 1920));

        driver.navigate().to(PROD_URL+"/integrations/automate");
        percy.snapshot("/integrations/automate page",Arrays.asList(375, 480, 720, 1280, 1440, 1920));

        driver.navigate().to(PROD_URL+"/docs");
        percy.snapshot("/docs page", Arrays.asList(375, 480, 720, 1280, 1440, 1920), null, false, "div#main-content, div.wrapper {overflow: visible !important}");
    }

}
