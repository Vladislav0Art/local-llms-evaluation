package org.jsoup.helper;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedTestConnectWithProxyMethod {

    @Test
    public void testConnectWithProxyMethod() {
        Method method = new Method(Method.GET);
        HttpConnection connection = HttpConnection.connect(method, "https://example.com");
        assertEquals(true, connection.isAlive());
    }

}