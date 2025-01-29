package org.jsoup.helper;

public class GeneratedTestMessageProperty {

    private static final String URL = "https://example.com";
    private static final URL TEST_URL = new URL("http://example.com/test");

    @Before
    public void init() {
    }

    @Test
    public void testMessageProperty() {
        ConnectionResponse connectionResponse = response();
        assertEquals(MESSAGE, connectionResponse.getMessage());
    }
}

public class CookieStoreTest {
    private static final String COOKIE = "test_cookie";

    public static CookieStore cookieStore() {
        // implementation
        return new CookieStore();
    }

}