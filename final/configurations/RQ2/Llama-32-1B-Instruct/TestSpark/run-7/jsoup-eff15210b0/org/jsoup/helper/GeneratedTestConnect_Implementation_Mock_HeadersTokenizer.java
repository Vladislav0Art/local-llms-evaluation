package org.jsoup.helper;

public class GeneratedTestConnect_Implementation_Mock_HeadersTokenizer {

    @Test
    public void testConnect_Implementation_Mock_HeadersTokenizer() {
        mockHttpConnection();
        HttpConnection httpConnection = new HttpConnection();
        assertNotSame(httpConnection, null);
        assertEquals("mocked-url", httpConnection.get().getHeadersTokenizer().toString());
    }

}