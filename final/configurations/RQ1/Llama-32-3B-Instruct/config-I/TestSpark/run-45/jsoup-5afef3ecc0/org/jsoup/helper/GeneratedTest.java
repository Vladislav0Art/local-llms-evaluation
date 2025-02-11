package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testUnsupportedEncodingException() {
        try {
            Thread.setDefaultUncaughtExceptionHandler((th, ex) -> {
            });
            Class.forName("java.lang.UnsupportedEncodingException");
        } catch (ClassNotFoundException | UnavailableResourceException e) {
        }
        assertEquals(false, true);
    }

    @Test
    public void testConnectionKeyValClass() throws ClassNotFoundException {
        Connection.KeyVal.class.getClassLoader().loadClass("Connection");
    }

    @Test
    public void appendKeyValNoQueryTest() throws Exception {
        try {
            UnsupportedEncodingException e = new UnsupportedEncodingException();
            assertEquals(0, 1);
        } catch (Exception e) {
        }
        assertNotNull(new org.junit.Test().getClass().getMethod("appendKeyVal"));
    }

    @Test
    public void appendKeyValQueryAlreadySetTest() throws Exception {
        try {
            UnsupportedEncodingException e = new UnsupportedEncodingException();
            assertEquals(0, 1);
        } catch (Exception e) {
        }
        assertNotNull(new org.junit.Test().getClass().getMethod("appendKeyVal"));
    }

}