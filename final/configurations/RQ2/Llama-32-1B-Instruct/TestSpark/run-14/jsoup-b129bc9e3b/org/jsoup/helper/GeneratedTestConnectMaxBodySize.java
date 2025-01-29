package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestConnectMaxBodySize {

    @Test
    public void testConnectMaxBodySize() {
        int maxSizeBytes = 1024;
        HttpConnection connection = new HttpConnection(maxSizeBytes);
        assertEquals(maxSizeBytes, connection.maxBodySize(maxSizeBytes));
    }

}