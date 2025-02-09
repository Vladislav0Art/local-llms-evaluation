package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.InputStream;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedRequestTest {

    @Test
    public void requestTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection.Request request = Mockito.mock(Connection.Request.class);
        Connection connection = httpConnection.request(request);
        assertNotNull(connection);
    }

}