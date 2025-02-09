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

public class GeneratedResponseTest {

    @Test
    public void responseTest() {
        HttpConnection httpConnection = new HttpConnection();
        Connection.Response response = Mockito.mock(Connection.Response.class);
        Connection connection = httpConnection.response(response);
        assertNotNull(connection);
    }

}