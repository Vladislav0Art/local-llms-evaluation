package org.jsoup.helper;

public class GeneratedIgnoreContentType_SetIgnoreContentType {

    @Test
    public void ignoreContentType_SetIgnoreContentType() {
        boolean ignoreContentType = true;
        Connection connection = HttpConnection.ignoreContentType(ignoreContentType);
        assertNotNull(connection);
        assertTrue(connection instanceof Request);
    }

}