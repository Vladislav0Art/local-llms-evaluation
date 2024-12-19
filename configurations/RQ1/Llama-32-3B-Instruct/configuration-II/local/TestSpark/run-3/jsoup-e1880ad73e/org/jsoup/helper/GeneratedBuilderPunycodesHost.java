package org.jsoup.helper;

public class GeneratedBuilderPunycodesHost {

    @Test
    public void builderPunycodesHost() {
        // given
        URL inputUrl = new URL("http://example.com/path?query#fragment");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // when
        URL result = urlBuilder.build();

        // then
        assert result.getProtocol().equals("http");
        assert result.getHost().equals(IDN.toASCII("example.com"));
    }

}