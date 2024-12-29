package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestBuildWithValidKeyAndValue {

    @Test
    public void testBuildWithValidKeyAndValue() throws Exception {
        UrlBuilder2 urlBuilder = new UrlBuilder2();
        Connection connection = urlBuilder.connection;
        connection.setBytes("test".getBytes());
        assertEquals("key=test", urlBuilder.build("key", "value"));
    }

}