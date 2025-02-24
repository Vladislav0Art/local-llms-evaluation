package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.helper.HttpConnection;

import static org.junit.Assert.*;

public class GeneratedTestNewRequest {

    private HttpConnection httpConnection;

    @Before
    public void initialize() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testNewRequest() {
        HttpConnection connection = httpConnection.newRequest();
        assertNotNull(connection);
    }

}