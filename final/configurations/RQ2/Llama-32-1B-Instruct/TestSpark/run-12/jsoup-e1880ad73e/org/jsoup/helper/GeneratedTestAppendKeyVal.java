package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedTestAppendKeyVal {

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
    public void testAppendKeyVal() throws Exception {
        try {
            UrlBuilder builder = new UrlBuilder(new URI("https://example.com/path"));
            String key = "param1";
            String value = "123";
            builder.appendKeyVal(Connection.KeyVal.of(key, value));
            assertThat(builder.build().toASCIIString()).isEqualTo("param1=123");
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

}