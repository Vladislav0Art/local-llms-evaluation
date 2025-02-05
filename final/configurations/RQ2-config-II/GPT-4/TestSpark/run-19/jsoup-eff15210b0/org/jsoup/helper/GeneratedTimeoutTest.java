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
public class GeneratedTimeoutTest {

    @Mock
    private HttpConnection httpConnection;

    @Mock
    private URL mockedUrl;

    @Test
    public void timeoutTest() {
        int timeout = 5000;
        when(httpConnection.timeout(timeout)).thenReturn(httpConnection);
        Assert.assertEquals("Failed to set timeout", httpConnection, httpConnection.timeout(timeout));
    }

}