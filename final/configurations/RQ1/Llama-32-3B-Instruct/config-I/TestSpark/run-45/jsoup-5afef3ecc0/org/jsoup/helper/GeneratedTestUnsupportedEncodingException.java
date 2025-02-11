package org.jsoup.helper;

public class GeneratedTestUnsupportedEncodingException {

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

}