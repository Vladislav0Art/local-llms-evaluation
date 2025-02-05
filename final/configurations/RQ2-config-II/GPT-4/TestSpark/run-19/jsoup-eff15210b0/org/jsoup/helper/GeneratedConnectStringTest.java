package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.jsoup.Connection;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConnectStringTest {

    @Mock
    private HttpConnection httpConnection;

    @Mock
    private URL mockedUrl;

    @Test
    public void connectStringTest() throws IOException {
        String url = "http://example.com";
        when(httpConnection.connect(url)).thenReturn(httpConnection);
        Assert.assertEquals("Failed to connect", httpConnection, HttpConnection.connect(url));
    }

}