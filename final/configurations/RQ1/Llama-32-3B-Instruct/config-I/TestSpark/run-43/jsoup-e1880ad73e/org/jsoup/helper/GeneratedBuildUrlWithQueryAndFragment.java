package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(JUnit4.class)
public class GeneratedBuildUrlWithQueryAndFragment {

    @Test
    public void buildUrlWithQueryAndFragment() {
        URL inputUrl = new URL("http://example.com/path?a=1&b=2#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        URL url = urlBuilder.build();
        assertEquals("http://example.com/path?a=1%26b=2#fragment", url.toString());
    }

}