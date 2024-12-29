package org.jsoup.helper;

public class GeneratedTestConnectWithParams {

    @Test
    public void testConnectWithParams() {
        MockHttpConnection connection = new MockHttpConnection();
        URL url = new URL("https://example.com?param1=value1&param2=value2");
        assertEquals("https://example.com?", connection.connect(url));
    }

}