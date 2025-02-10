package org.jsoup.helper;

public class GeneratedMaxBodySize_SetMaxBodySize {

    @Test
    public void maxBodySize_SetMaxBodySize() {
        int bytes = 1024;
        Connection connection = HttpConnection.maxBodySize(bytes);
        assertNotNull(connection);
        assertTrue(connection instanceof Request);
    }

}