package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestConnectIgnoreContentType {

    @Test
    public void testConnectIgnoreContentType() {
        boolean ignoreContentType = false;
        HttpConnection connection = new HttpConnection(ignoreContentType(ignoreContentType));
        assertEquals(ignoreContentType, connection.ignoreContentType(ignoreContentType));
    }

}