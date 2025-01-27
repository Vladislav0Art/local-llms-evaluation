package org.jsoup.helper;

public class GeneratedUrlBuilder_build_WithEncodedQuery {

    @Test
    public void urlBuilder_build_WithEncodedQuery() throws MalformedURLException, URISyntaxException {
        //given
        String inputUrl = "http://example.com/path?key=value&other=param";
        UrlBuilder builder = new UrlBuilder(new URL(inputUrl));

        //when
        URL url = builder.build();

        //then
        assertEquals(inputUrl, url.toString());
    }

}