package org.jsoup.helper;

public class GeneratedUrlBuilder_build_WithNonEncodedQuery {

    @Test
    public void urlBuilder_build_WithNonEncodedQuery() throws MalformedURLException, URISyntaxException {
        //given
        String inputUrl = "http://example.com/path?key=value&other=param";
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com/"));

        //when
        URL url = builder.build();

        //then
        assertEquals(inputUrl, url.toString());
    }

}