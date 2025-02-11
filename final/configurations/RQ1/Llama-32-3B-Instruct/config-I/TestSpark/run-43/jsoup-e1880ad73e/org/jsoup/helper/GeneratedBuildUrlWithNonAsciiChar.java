package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(JUnit4.class)
public class GeneratedBuildUrlWithNonAsciiChar {

    @Test
    public void buildUrlWithNonAsciiChar() {
        URL inputUrl = new URL("http://éxample.co.uk");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL url = urlBuilder.build();
        assertEquals("http%3F//ex%61mpl3.co.uk", url.toString());
    }

}