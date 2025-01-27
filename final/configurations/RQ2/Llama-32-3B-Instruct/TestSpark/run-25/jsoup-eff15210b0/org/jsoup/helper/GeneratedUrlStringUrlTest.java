package org.jsoup.helper;

public class GeneratedUrlStringUrlTest {

    @Test
    public void urlStringUrlTest() {
        Connection connection = HttpConnection.connect("https://example.com");
        Connection url = connection.url("https://example.com");
        assertEquals(1, url.hashCode());
    }

}