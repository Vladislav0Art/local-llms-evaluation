package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedRequestMethodWithValidURL {

    private HttpConnection httpConnection;

    @Before
    public void setup() {
        httpConnection = Mockito.mock(HttpConnection.class);
    }

    @Test
    public void requestMethodWithValidURL() {
        Connection.Request request = httpConnection.request();
        assertTrue(request instanceof Connection.Request);
    }

}