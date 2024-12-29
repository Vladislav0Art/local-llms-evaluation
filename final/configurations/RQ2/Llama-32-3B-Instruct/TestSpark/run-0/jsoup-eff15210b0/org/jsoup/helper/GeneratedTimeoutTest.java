package org.jsoup.helper;

public class GeneratedTimeoutTest {

    @Test
    public void timeoutTest() throws IOException {
        assertSame(HttpConnection.timeout(1000), HttpConnection.connect("https://example.com").timeout(1000));
    }

}