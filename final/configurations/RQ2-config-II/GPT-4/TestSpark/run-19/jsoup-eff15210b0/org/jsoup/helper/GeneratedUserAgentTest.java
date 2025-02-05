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
public class GeneratedUserAgentTest {

    @Mock
    private HttpConnection httpConnection;

    @Mock
    private URL mockedUrl;

    @Test
    public void userAgentTest() {
        String userAgent = "Mozilla";
        when(httpConnection.userAgent(userAgent)).thenReturn(httpConnection);
        Assert.assertEquals("Failed to set user agent", httpConnection, httpConnection.userAgent(userAgent));
    }

}