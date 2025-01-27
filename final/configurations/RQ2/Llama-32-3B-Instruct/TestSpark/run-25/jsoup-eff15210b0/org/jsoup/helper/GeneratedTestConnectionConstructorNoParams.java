package org.jsoup.helper;

public class GeneratedTestConnectionConstructorNoParams {

    @org.junit.Test
    public void testConnection() {
        org.junit.Assert.assertThrows(IllegalStateException.class, () -> new Connection());
    }

    @Test
    public void testConnectionConstructorNoParams() {
        public static Connection connection = new Connection();
        org.junit.Assert.assertNotNull(connection);
    }

}