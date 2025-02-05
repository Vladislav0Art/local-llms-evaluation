package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.jsoup.helper.HttpConnection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.SocketException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDataKeyAndValueTest {

    @Mock
    private URL urlMock;

    @Mock
    private InputStream inputStreamMock;

    @Mock
    private Proxy proxyMock;

    @Mock
    private CookieStore cookieStoreMock;

    @Mock
    private Parser parserMock;

    @Test
    public void dataKeyAndValueTest() {
        Connection connection = new HttpConnection();
        assertNotNull(connection.data("key", "value"));
    }

}