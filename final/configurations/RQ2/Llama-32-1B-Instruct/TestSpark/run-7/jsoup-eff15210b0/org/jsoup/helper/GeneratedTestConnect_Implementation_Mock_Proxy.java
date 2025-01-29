package org.jsoup.helper;

public class GeneratedTestConnect_Implementation_Mock_Proxy {

    @Test
    public void testConnect_Implementation_Mock_Proxy() {
        mockHttpConnection();
        HttpConnection httpConnection = new HttpConnection();
        assertNotSame(httpConnection, null);
        assertEquals("mocked-url", httpConnection.get().getURL().toString());
    }

}