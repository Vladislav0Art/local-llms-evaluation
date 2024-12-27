package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;
import java.io.IOException;
import java.util.Map;

public class GeneratedNewRequest_ReturnsNewRequest {

    @Test
    public void newRequest_ReturnsNewRequest() {
        HttpConnection connection = HttpConnection.connect(new URL("https://www.example.com"));
        Connection newRequest = connection.newRequest();
        assertNotNull(newRequest);
        assertTrue(isinstanceOf(Request.class, newRequest));
    }

}