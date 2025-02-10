package org.jsoup.helper;

public class GeneratedData_SetDataParameter {

    @Test
    public void data_SetDataParameter() {
        String key = "key";
        String value = "value";
        Connection connection = HttpConnection.data(key, value);
        assertNotNull(connection);
        assertTrue(connection instanceof Request);
    }

}