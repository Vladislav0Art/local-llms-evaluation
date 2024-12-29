package org.jsoup.helper;

public class GeneratedTestHeader {

    @Test
    public void testHeader() {
        MockHttpConnection connection = new MockHttpConnection();
        assertEquals("HTTP/1.1 200 OK", connection.header("Host", "localhost:8080"));
        fail("Expected String value");
    }

}