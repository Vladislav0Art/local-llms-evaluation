package org.jsoup.helper;

public class GeneratedTestConnectMaxBodySize {

    @Test
    public void testConnectMaxBodySize() {
        TestHttpConnection connection = new TestHttpConnection();
        assertEquals(1024 * 10, connection.maxBodySize(10240));
    }

}