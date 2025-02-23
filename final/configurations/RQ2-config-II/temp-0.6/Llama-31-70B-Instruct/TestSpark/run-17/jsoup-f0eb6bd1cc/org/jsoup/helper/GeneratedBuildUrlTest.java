package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class GeneratedBuildUrlTest {

    private String inputUrl;
    private UrlBuilder urlBuilder;

    public UrlBuilderTest(String inputUrl) {
        this.inputUrl = inputUrl;
        try {
            this.urlBuilder = new UrlBuilder(new URL(inputUrl));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"https://www.example.com"},
                {"https://www.example.com/"},
                {"https://www.example.com?query=value"},
                {"https://www.example.com/?query=value"},
                {"https://www.example.com/path/to/resource?query=value"}
        };
    }

    @Test
    public void buildUrlTest() {
        URL expectedUrl;
        try {
            expectedUrl = new URL(inputUrl);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        try {
            assertEquals(expectedUrl, urlBuilder.build());
        } catch (UnsupportedEncodingException | URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

}