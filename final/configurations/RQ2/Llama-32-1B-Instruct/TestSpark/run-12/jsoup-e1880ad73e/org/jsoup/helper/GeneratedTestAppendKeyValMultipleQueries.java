package org.jsoup.helper;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GeneratedTestAppendKeyValMultipleQueries {

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
    public void testAppendKeyValMultipleQueries() throws Exception {
        try {
            UrlBuilder builder = new UrlBuilder(new URI("https://example.com/path"));
            String key1 = "param1";
            String value1 = "123";
            String key2 = "anotherParam";
            String value2 = "456";

            builder.appendKeyVal(Connection.KeyVal.of(key1, value1));
            builder.appendKeyVal(Connection.KeyVal.of(key2, value2));

            assertThat(builder.build().toASCIIString()).isEqualTo("param1=123&anotherParam=456");
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

}