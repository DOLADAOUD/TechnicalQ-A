package testPages;

import base.CommonAPI;
import org.testng.annotations.Test;

import java.io.IOException;

public class homePage extends CommonAPI {
    @Test
    public void findBrokenLinks()throws IOException {
        brokenLink();
    }

}
