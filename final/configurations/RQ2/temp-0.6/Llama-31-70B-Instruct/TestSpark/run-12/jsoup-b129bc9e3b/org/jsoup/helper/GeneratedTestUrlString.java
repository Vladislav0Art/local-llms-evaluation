package org.jsoup.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.net.URL;
import java.util.Map;

import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.HttpConnection.Request;
import org.jsoup.helper.HttpConnection.Response;
import org.junit.Test;

public class GeneratedTestUrlString {

    @Test
    public void testUrlString() throws IOException {
        // Arrange
        String url = "https://example.com";
        HttpConnection httpConnection = new HttpConnection();

        // Act
        httpConnection.url(url);

        // Assert
        assertEquals(url, httpConnection.request().url().toString());
    }

}