package org.jsoup.helper;

public class GeneratedDataNullUrlTest {

    @Test
    public void dataNullUrlTest() {
        assertEquals(null, HttpConnection.data(null, new URL("https://example.com")));
    }

}