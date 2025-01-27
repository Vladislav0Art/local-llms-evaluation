package org.jsoup.helper;

public class GeneratedDataStringKeyFilenameInputStreamContentTypeTest {

    @Test
    public void dataStringKeyFilenameInputStreamContentTypeTest() throws IOException {
        InputStream inputStream = new ByteArrayInputStream(new byte[0]);
        Connection connection = HttpConnection.connect("https://example.com");
        Connection data = connection.data("key", "filename", inputStream, "text/plain");
        assertNotNull(data);
    }

}