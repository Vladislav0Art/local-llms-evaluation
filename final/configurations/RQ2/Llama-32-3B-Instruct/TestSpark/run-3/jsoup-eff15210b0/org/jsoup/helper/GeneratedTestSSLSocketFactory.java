package org.jsoup.helper;

import org.junit.Test;

public class GeneratedTestSSLSocketFactory {

    @Test
    public void testSSLSocketFactory() {
        SSLSocketFactory sslSocketFactory = new MockSSLSocketFactory();
        assertEquals(MockSSLSocketFactory.class, sslSocketFactory.getImplementation());
    }

}