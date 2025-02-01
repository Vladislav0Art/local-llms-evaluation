package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.mockito.Mockito;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        try {
            URL url = new URL("https://test.com?param=value#section");
            UrlBuilder builder = new UrlBuilder(url);
            URL result = builder.build();

            assertEquals("https://test.com/?param=value#section", result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}