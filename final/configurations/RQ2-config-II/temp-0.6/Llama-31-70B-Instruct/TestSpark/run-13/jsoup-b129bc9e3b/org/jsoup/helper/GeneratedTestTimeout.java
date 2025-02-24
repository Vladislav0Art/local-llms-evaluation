package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.URL;

import static org.mockito.Mockito.*;

public class GeneratedTestTimeout {

    private HttpConnection httpConnection;

    @Before
    public void setUp() throws Exception {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testTimeout() {
        Assert.assertNotNull(httpConnection.timeout(1000));
    }

}