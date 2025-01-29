package org.jsoup.helper;

public class GeneratedTestConnect_Implementation_Mock_CookieStore {

    @Test
    public void testConnect_Implementation_Mock_CookieStore() {
        mockHttpConnection();
        HttpConnection httpConnection = new HttpConnection();
        assertNotSame(httpConnection, null);
        assertEquals("mocked-url", httpConnection.get().getCookieManager().getCookieStore().toString());
    }

}