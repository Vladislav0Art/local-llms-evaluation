package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedBuildUrlWithEncodedSpacesInReferenceTest {

    @Test
    public void buildUrlWithEncodedSpacesInReferenceTest() throws Exception {
        URL inputUrl = new URL("https://www.example.com/test#ref+with+spaces");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        URL result = builder.build();
        assertEquals("https://www.example.com/test#ref%20with%20spaces", result.toString());
    }

}