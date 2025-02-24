package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.HttpConnection.Request;
import org.jsoup.helper.HttpConnection.Response;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestNewRequest {

    @Test
    public void testNewRequest() {
        Request request = new HttpConnection().newRequest();
        assertNotNull(request);
    }

}