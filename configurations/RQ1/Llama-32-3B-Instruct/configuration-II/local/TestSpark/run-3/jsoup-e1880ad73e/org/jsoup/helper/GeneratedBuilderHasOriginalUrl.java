package org.jsoup.helper;

public class GeneratedBuilderHasOriginalUrl {

    @Test
    public void builderHasOriginalUrl() {
        // given
        URL inputUrl = new URL("http://example.com/path?query#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // when
        URL result = urlBuilder.build();

        // then
        assert result.getProtocol().equals("http");
        assert result.getHost().equals("example.com");
        assert result.getPath() == null;
        assert result.getQuery() != null;
        assert result.getRef() != null;
    }

}