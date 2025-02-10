package org.jsoup.helper;

public class GeneratedBuild_validURL {

    @Test
    public void build_validURL() throws URISyntaxException, UnsupportedEncodingException {
        // valid URL
        String url = "https://example.com";
        Connection connection = Mockito.mock(Connection.class);
        when(connection.toString()).thenReturn(url);
        UrlBuilder urlBuilder = new UrlBuilder((String) connection);
        assertEquals(url, urlBuilder.build());
    }

}