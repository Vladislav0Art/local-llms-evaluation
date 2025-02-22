package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

public class GeneratedBuildTest {

    @Test
    public void buildTest() throws Exception {
        URL inputUrl = new URL("http://www.example.com/file.html?key=value");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL outputUrl = urlBuilder.build();
        assertEquals("http://www.example.com/file.html?key=value", outputUrl.toString());
    }

}