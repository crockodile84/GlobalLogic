package tests;

import entities.Page;
import org.junit.Before;

/**
 * Created by Олег on 25.04.2016.
 */
public class BaseTest {
    Page page;
    @Before
    public void setUpTest(){
        page = new Page();
    }

    public String addEndpoint (String suffixUrl){
        String endpoint;
        return endpoint = String.valueOf(new StringBuilder(page.getHost()).append(suffixUrl));
    }

}
