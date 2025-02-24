package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.jsoup.helper.HttpConnection;
import org.junit.Test;

public class GeneratedGetProxyTest {

    @Test
    public void getProxyTest() {
        HttpConnection connection = new HttpConnection();
        assertEquals(null, connection.getProxy());
    }

}