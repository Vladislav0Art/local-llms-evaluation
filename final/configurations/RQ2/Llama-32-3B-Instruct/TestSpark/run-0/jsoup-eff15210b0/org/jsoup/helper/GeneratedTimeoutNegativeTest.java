package org.jsoup.helper;

public class GeneratedTimeoutNegativeTest {

    @Test
    public void timeoutNegativeTest() throws IOException {
        assertSame(HttpConnection.timeout(-1), -1);
    }

}