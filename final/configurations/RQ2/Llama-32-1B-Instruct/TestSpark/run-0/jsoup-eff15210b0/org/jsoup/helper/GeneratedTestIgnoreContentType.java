package org.jsoup.helper;

public class GeneratedTestIgnoreContentType {

    @Test
    public void testIgnoreContentType() {
        MockHttpConnection connection = new MockHttpConnection();
        assertEquals(true, connection.ignoreContentType(false));
    }

}