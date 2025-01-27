package org.jsoup.helper;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import java.net.URL;
import java.util.List;

public class GeneratedTestBuildUrlWithKeyAndValue {

    @Test
    public void testBuildUrlWithKeyAndValue() {
        String url = "http://example.com";
        String key1 = "key1";
        String value1 = "value1";
        String key2 = "key2";
        String value2 = "value2";

        UrlBuilder builder = new UrlBuilder(url);
        List<UrlBuilder.KeyVal> kvList = List.of(
                new UrlBuilder.KeyVal(key1, value1),
                new UrlBuilder.KeyVal(key2, value2)
        );
        builder.appendKeyAndValue(kvList);

        URL expectedUrl = new URL("http://example.com?key1=value1&key2=value2");
        assertThat(builder.build(), is(expectedUrl));
    }

}