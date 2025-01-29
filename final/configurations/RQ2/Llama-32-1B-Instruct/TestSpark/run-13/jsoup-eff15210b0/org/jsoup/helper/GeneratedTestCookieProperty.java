package org.jsoup.helper;

public class GeneratedTestCookieProperty {

    private static final String URL = "https://example.com";
    private static final URL TEST_URL = new URL("http://example.com/test");

    @Before
    public void init() {
    }

    @Test
    public void testCookieProperty() {
        CookieStore cookieStore = cookieStore();
        assertNotNull(cookieStore);
        assertEquals("test_cookie", cookieStore.getCookie());
    }

}