package org.jsoup.helper;

public class GeneratedData_WithFilename_SetDataParameter {

    @Test
    public void data_WithFilename_SetDataParameter() {
        String filename = "filename.txt";
        InputStream inputStream = new ByteArrayInputStream(new byte[0]);
        Connection connection = HttpConnection.data("key", filename, inputStream);
        assertNotNull(connection);
        assertTrue(connection instanceof Request);
    }

}