package org.jsoup.helper;

public class GeneratedUrlBuilder_Constructor_NotEmptyUrl {

    @Test
    public void urlBuilder_Constructor_NotEmptyUrl() {
        //given
        String inputUrl = "http://example.com/path";
        UrlBuilder builder = new UrlBuilder(new URL(inputUrl));

        //when
        URL url = builder.build();

        //then
        assertEquals(inputUrl, url.toString());
    }

}