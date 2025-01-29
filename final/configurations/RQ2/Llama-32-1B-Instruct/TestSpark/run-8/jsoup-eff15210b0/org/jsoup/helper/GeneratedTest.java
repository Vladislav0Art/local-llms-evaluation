package org.jsoup.helper;

public class GeneratedTest {

    private static CookieStore cookieStore = new CookieManager();
    private static Response response;

    public void testCookieAdd() {
        Request request = new Request(url);
        cookies.add(cookieStore.addCookie("session_id", "12345"));
    }

    public void testGetResponse() {
        request = new Request(url);
        response = (Response) request.send();
    }

    public void testCheckCookiesContains() {
        if (!cookies.contains("session_id")) {
            throw new AssertionError("Expected 'session_id' to be in the cookies");
        }
    }

    public static void main(String[] args) {
        GeneratedTest test = new GeneratedTest();
        test.testCookieAdd();
        test.testGetResponse();
        test.testCheckCookiesContains();

        // Additional tests
        test.testRemoveCookie();
        test.testGetResponseAfterRemoveCookie();
        test.testCheckCookiesContainsAfterRemoveCookie();
    }

    public void testRemoveCookie() {
        Request request = new Request(url);
        cookies.remove(cookieStore.addCookie("session_id", "12345"));
        assert response == null;
    }

    public void testGetResponseAfterRemoveCookie() {
        Response response = (Response) request.send();
        if (!response.isSuccessful()) {
            throw new AssertionError("Expected 'response' to be successful");
        }
    }

    public void testCheckCookiesContainsAfterRemoveCookie() {
        Cookie cookie = new Cookie("session_id", "12345");
        cookies.add(cookie);
        assert !cookies.contains(cookie);
    }

    @Test
    public void testGetResponseOnlyWithOneCookie() {
        Request request = new Request(url);
        Response response = (Response) request.send();
        assertEquals(200, response.getStatus());
        assertNotNull(response.getContent());
    }

}