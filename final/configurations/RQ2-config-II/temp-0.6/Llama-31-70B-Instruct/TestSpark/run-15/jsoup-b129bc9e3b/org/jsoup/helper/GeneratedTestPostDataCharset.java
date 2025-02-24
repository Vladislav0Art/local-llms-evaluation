package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.HttpConnection.Response;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPostDataCharset {

    @Test
    public void testPostDataCharset() {
        HttpConnection httpConnection = new HttpConnection();
        assertEquals("UTF-8", httpConnection.postDataCharset());
    }

}