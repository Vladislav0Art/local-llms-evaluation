package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestConnectMethod {

    @Test
    public void testConnectMethod() {
        Method method = HEAD;
        HttpConnection connection = new HttpConnection(method);
        assertEquals(HEAD, connection.method(method));
    }

}