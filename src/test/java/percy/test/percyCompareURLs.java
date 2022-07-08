package percy.test;

import org.testng.annotations.Test;

public class percyCompareURLs extends BaseTest {


    @Test
    public void snapshotCompare() {
        driver.get(PROD_URL);
        percy.snapshot("/home page");

        driver.navigate().to(PROD_URL+"/pricing");
        percy.snapshot("/pricing page");

        driver.navigate().to(PROD_URL+"/automate");
        percy.snapshot("/integrations/automate page");

        driver.navigate().to(PROD_URL+"/docs");
        percy.snapshot("/docs page");
    }

}