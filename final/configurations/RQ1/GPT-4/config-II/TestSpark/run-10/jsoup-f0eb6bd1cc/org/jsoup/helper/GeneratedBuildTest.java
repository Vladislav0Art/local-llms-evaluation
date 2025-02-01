package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        try {
            URL inputUrl = new URL("http://www.google.com?query=test");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            assertTrue(urlBuilder.build().toString().equals("http://www.google.com?query=test"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}