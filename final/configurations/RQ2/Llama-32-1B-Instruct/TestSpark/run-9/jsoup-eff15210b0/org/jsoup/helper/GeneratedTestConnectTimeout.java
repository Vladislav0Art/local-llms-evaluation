package org.jsoup.helper;

public class GeneratedTestConnectTimeout {

    @Test
    public void testConnectTimeout() {
        TestHttpConnection connection = new TestHttpConnection();
        assertEquals(10000, connection.timeout(0));
    }

}