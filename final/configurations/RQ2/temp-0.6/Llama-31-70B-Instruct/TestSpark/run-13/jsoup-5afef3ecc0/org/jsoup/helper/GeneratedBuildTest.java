package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedBuildTest {

    @Test
    public void buildTest() {
        try {
            URL inputUrl = new URL("http://www.example.com/");
            UrlBuilder builder = new UrlBuilder(inputUrl);
            URL outputUrl = builder.build();
            assertEquals(inputUrl, outputUrl);
        } catch (Exception e) {
            fail("Should not throw exception");
        }
    }

}