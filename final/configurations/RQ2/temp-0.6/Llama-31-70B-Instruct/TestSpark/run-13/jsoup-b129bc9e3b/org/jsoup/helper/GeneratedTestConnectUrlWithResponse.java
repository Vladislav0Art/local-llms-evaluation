package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.HttpConnection.KeyVal;
import org.jsoup.helper.HttpConnection.Response;
import org.jsoup.nodes.Document;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.Response;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeneratedTestConnectUrlWithResponse {

    @Mock
    private HttpConnection mockHttpConnection;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testConnectUrlWithResponse() {
        String url = "https://www.example.com";
        Response response = HttpConnection.connect(url).execute();
        assertNotNull(response);
    }

}