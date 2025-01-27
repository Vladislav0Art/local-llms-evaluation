package org.jsoup.helper;

public class GeneratedDataStringKeyFilenameInputStreamTest {

    @Test
    public void dataStringKeyFilenameInputStreamTest() throws IOException {
        InputStream inputStream = new ByteArrayInputStream(new byte[0]);
        Connection connection = HttpConnection.connect("https://example.com");
        Connection data = connection.data("key", "filename", inputStream);
        assertNotNull(data);
    }

}