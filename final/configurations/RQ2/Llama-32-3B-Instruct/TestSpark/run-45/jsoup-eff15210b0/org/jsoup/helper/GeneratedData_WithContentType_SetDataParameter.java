package org.jsoup.helper;

public class GeneratedData_WithContentType_SetDataParameter {

    @Test
    public void data_WithContentType_SetDataParameter() {
        String key = "key";
        String contentType = "application/json";
        InputStream inputStream = new ByteArrayInputStream(new byte[0]);
        Connection connection = HttpConnection.data(key, null, inputStream, contentType);
        assertNotNull(connection);
        assertTrue(connection instanceof Request);
    }

}