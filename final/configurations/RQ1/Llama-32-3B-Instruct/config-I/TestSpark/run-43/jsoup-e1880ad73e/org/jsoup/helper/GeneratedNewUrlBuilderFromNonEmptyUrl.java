package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(JUnit4.class)
public class GeneratedNewUrlBuilderFromNonEmptyUrl {

    @Test
    public void newUrlBuilderFromNonEmptyUrl() {
        URL inputUrl = new URL("http://example.com");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        assertNotNull(urlBuilder.u);
        assertEquals(0, urlBuilder.u.getProtocol().length());
        assertNotNull(urlBuilder.q);
    }

}