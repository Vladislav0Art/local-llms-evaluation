package org.jsoup.helper;

public class GeneratedBuilderEncodesQuery {

    @Test
    public void builderEncodesQuery() {
        // given
        URL inputUrl = new URL("http://example.com/path?query=Hello, World!#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // when
        URL result = urlBuilder.build();

        // then
        assert result.getProtocol().equals("http");
        assert result.getHost().equals(IDN.toASCII("example.com"));
        assert result.getPath() == null;
        assert result.getQuery().equals(IDN.toASCII("query=Hello%2C+World%!"));
    }

}