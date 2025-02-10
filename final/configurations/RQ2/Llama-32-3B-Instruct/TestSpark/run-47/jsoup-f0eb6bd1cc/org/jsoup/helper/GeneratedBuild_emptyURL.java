package org.jsoup.helper;

public class GeneratedBuild_emptyURL {

    @Test
    public void build_emptyURL() throws URISyntaxException, UnsupportedEncodingException {
        // invalid URL
        String url = "";
        Connection connection = Mockito.mock(Connection.class);
        when(connection.toString()).thenReturn(url);
        UrlBuilder urlBuilder = new UrlBuilder((String) connection);
        assertNull(urlBuilder.build());
    }

}