package org.jsoup.helper;

public class GeneratedDataStringKeyTest {

    @Test
    public void dataStringKeyTest() {
        Connection connection = HttpConnection.connect("https://example.com");
        Connection data = connection.data("key", "value");
        assertNotNull(data);
    }

}