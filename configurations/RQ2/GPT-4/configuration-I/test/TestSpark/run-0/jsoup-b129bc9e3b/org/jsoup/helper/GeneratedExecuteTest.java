package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

import java.net.Proxy;
import java.io.InputStream;

import static org.mockito.Mockito.*;

public class GeneratedExecuteTest {

    @Test
    public void executeTest() throws IOException {
        HttpConnection connection = new HttpConnection();
        Connection.Response response = connection.execute();
        assertNotNull(response);
    }

}