package org.jsoup.helper;

public class GeneratedTestProxyToString {

    @Test
    public void testProxyToString() {
        MockHttpConnection mock = new MockHttpConnection();
        String actual = mock.proxy("http://example.com").toString();
        assertEquals("http://example.com", actual);
    }

}