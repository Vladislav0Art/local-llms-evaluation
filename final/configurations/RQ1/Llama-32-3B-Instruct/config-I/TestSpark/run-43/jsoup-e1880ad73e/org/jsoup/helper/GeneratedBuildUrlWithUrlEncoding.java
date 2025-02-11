package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(JUnit4.class)
public class GeneratedBuildUrlWithUrlEncoding {

    @Test
    public void buildUrlWithUrlEncoding() {
        URL inputUrl = new URL("http://example.com/path?query=1&2");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL url = urlBuilder.build();
        assertEquals("http%3F//examp%6dle.co.uk/path%3Fq%6eury%3D1%26%232", url.toString());
    }

}