package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void urlBuilderConstructionWithNullUrl() {
        assertThrows(NullPointerException.class, () -> new UrlBuilder(null));
    }

}