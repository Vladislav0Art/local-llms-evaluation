package org.jsoup.helper;

public class GeneratedTestConnect {

    @Test
    public void testConnect() {
        MockHttpConnection connection = new MockHttpConnection();
        assertEquals("https://example.com", connection.connect("https://example.com"));
    }

}