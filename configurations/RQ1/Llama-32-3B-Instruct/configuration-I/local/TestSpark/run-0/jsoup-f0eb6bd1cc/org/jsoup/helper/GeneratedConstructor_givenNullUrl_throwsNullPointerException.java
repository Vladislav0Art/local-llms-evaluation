package org.jsoup.helper;

public class GeneratedConstructor_givenNullUrl_throwsNullPointerException {

    @Test
    public void constructor_givenNullUrl_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new UrlBuilder(null));
    }

}