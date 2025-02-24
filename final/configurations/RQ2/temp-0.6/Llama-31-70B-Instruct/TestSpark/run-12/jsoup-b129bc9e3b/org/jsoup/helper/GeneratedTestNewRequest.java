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

public class GeneratedTestNewRequest {

    @Test
    public void testNewRequest() throws IOException {
        // Arrange
        Request request = mock(Request.class);
        HttpConnection httpConnection = new HttpConnection(request);

        // Act
        Connection connection = httpConnection.newRequest();

        // Assert
        assertNotNull(connection);
    }

}