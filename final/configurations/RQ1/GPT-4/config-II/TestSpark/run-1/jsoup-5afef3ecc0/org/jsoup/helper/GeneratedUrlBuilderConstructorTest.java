package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.mockito.Mockito;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedUrlBuilderConstructorTest {

    @Test
    public void UrlBuilderConstructorTest() {
        try {
            URL url = new URL("https://test.com?param=value");
            UrlBuilder builder = new UrlBuilder(url);
            assertEquals("test.com", builder.u.getHost());
            assertEquals("param=value", builder.q.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}