package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.URL;

import static org.mockito.Mockito.*;

public class GeneratedTestMaxBodySize {

    private HttpConnection httpConnection;

    @Before
    public void setUp() throws Exception {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testMaxBodySize() {
        Assert.assertNotNull(httpConnection.maxBodySize(1000));
    }

}