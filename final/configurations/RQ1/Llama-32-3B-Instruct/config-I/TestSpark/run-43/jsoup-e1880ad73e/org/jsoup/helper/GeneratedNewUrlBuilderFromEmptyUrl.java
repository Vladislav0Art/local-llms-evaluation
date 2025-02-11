package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(JUnit4.class)
public class GeneratedNewUrlBuilderFromEmptyUrl {

    @Test
    public void newUrlBuilderFromEmptyUrl() {
        UrlBuilder urlBuilder = new UrlBuilder(null);
        assertEquals(0, urlBuilder.u.getProtocol().length());
        assertNull(urlBuilder.q);
    }

}