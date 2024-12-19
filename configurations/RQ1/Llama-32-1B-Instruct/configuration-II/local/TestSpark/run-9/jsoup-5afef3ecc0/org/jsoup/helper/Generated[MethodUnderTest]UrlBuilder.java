package org.jsoup.helper;

public class Generated[MethodUnderTest]

UrlBuilder {

    @Test
    public void [MethodUnderTest]UrlBuilder() {
        // GIVEN
        String inputUrl = "https://example.com/path?query=value#fragment";

        // WHEN
        URLBuilder urlBuilder = new UrlBuilder(new URI(inputUrl));
        try {
            urlBuilder.build();
        } catch (MalformedURLException e) {
            assert false;
        }
    }

}