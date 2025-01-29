package org.jsoup.helper;

public class GeneratedTestIgnoreContentType {

    @Test
    public void testIgnoreContentType() {
        TestHttpConnection connection = new TestHttpConnection();
        assertEquals(0, connection.ignoreContentType(false));
    }

}