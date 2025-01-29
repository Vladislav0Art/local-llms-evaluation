package org.jsoup.helper;

public class GeneratedTestConnect_Implementation_Mock_Parser {

    @Test
    public void testConnect_Implementation_Mock_Parser() {
        mockHttpConnection();
        HttpConnection httpConnection = new HttpConnection();
        assertNotSame(httpConnection, null);
        assertEquals("mocked-url", httpConnection.get().getParser().toString());
    }

}