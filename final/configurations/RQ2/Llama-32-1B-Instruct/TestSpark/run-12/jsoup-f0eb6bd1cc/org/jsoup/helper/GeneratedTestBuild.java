package org.jsoup.helper;

import org.jsoup.helper.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestBuild {

    @Test
    public void testBuild() {
        URL url = new URL("https://example.com");
        String actual = UrlBuilder.build().toString();
        String expected = "https://example.com";
        Assert.assertEquals(expected, actual);
    }

}