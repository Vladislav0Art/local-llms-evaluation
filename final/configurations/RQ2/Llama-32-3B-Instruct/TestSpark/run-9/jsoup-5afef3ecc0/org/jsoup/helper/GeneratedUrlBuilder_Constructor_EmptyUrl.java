package org.jsoup.helper;

public class GeneratedUrlBuilder_Constructor_EmptyUrl {

    @Test
    public void urlBuilder_Constructor_EmptyUrl() {
        //given
        UrlBuilder builder = new UrlBuilder(null);

        //when
        URL url = builder.build();

        //then
        assertNull(url);
    }

}