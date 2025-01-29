package org.jsoup.helper;

public class GeneratedTestConnect_Implementation_Mock_CookieJar {

    @Test
    public void testConnect_Implementation_Mock_CookieJar() {
        mockHttpConnection();
        HttpConnection httpConnection = new HttpConnection();
        assertNotSame(httpConnection, null);
        assertEquals("mocked-url", httpConnection.get().getCookieJar().toString());
    }

}