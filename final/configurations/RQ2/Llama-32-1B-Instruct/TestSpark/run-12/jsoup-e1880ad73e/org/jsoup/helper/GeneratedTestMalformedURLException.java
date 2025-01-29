package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedTestMalformedURLException {

    @ParameterizedTest
    @CsvSource({
            "\"https://example.com/path1\"",
            "\"https%3A//example.com/path2?param=123&anotherParam=456&quot;
    })
    void testBuildUrl(String inputUrl) {
        try {
            UrlBuilder builder = new UrlBuilder(new URI(inputUrl));
            assertThat(builder.build().toASCIIString()).isEqualTo("https://example.com/path1");
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testMalformedURLException() throws Exception {
        try {
            UrlBuilder builder = new UrlBuilder(new URI("https://example.com/path"));
            assertThat(builder.build().toASCIIString()).isEqualTo("https%3A//example.com/path");
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @ParameterizedTest
    @CsvSource({
            "\"https%3A//example.com/path2?param=123&anotherParam=456\"",
            "\"invalid-url%3Fparam=value\""
    })
    void testUriDecoder(String inputUrl) {
        try {
            UrlBuilder builder = new UrlBuilder(new URI(inputUrl));
            assertThat(builder.build().toASCIIString()).isEqualTo("https://example.com/path2");
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

}