package org.jsoup.helper;

public class GeneratedShouldBuildUrl {

    @Test
    public void shouldBuildUrl() throws MalformedURLException {
        // given
        URL inputUrl = new URL("http://www.example.com/test?q1=v1&q2=v2");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        // when
        URL outputUrl = urlBuilder.build();

        // then
        assertEquals("http://www.example.com/test?q1=v1&q2=v2", outputUrl.toString());
    }

}