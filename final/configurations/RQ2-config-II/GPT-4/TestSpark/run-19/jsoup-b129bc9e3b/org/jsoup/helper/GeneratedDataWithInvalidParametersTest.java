package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

public class GeneratedDataWithInvalidParametersTest {

    @Test
    public void dataWithInvalidParametersTest() {
        HttpConnection httpConnection = new HttpConnection();
        httpConnection.data("key1", "value1", "key2");
    }

}