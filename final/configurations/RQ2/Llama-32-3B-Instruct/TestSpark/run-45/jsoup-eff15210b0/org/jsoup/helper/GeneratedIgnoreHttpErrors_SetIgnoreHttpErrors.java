package org.jsoup.helper;

public class GeneratedIgnoreHttpErrors_SetIgnoreHttpErrors {

    @Test
    public void ignoreHttpErrors_SetIgnoreHttpErrors() {
        boolean ignoreHttpErrors = true;
        Connection connection = HttpConnection.ignoreHttpErrors(ignoreHttpErrors);
        assertNotNull(connection);
        assertTrue(connection instanceof Request);
    }

}