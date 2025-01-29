package org.jsoup.helper;

public class GeneratedTestIgnoreHttpErrors {

    @Test
    public void testIgnoreHttpErrors() {
        TestHttpConnection connection = new TestHttpConnection();
        assertEquals(1, connection.ignoreHttpErrors(true));
    }

}