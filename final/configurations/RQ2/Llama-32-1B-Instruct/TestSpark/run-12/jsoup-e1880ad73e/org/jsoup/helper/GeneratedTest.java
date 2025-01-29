package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedTest {

    @ParameterizedTest
    @CsvSource({
            "\"https://example.com/path1\"",
            "\"https%3A//example.com/path2?param=123&anotherParam=456\""
    })
    void testBuildUrl(String inputUrl) {
        try {
            UrlBuilder builder = new UrlBuilder(new URI(inputUrl));
            assertThat(builder.build().toASCIIString()).isEqualTo("https://example.com/path1");
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    public class UrlBuilder {
        private URI uri;

        public UrlBuilder(URI uri) {
            this.uri = uri;
        }

    }