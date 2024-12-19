package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNewUrlBuilderWithEmptyUrl {

    @Test
    public void newUrlBuilderWithEmptyUrl() {
        UrlBuilder builder = new UrlBuilder("");
        String result = builder.build();
        assertEquals(null, result);
    }

}