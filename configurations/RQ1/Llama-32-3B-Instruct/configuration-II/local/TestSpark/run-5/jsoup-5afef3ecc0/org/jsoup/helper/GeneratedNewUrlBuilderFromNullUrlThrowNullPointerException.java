package org.jsoup.helper;

public class GeneratedNewUrlBuilderFromNullUrlThrowNullPointerException {

    @Test
    public void newUrlBuilderFromNullUrlThrowNullPointerException() {
        assertThrows(NullPointerException.class, () -> new UrlBuilder(null));
    }

}