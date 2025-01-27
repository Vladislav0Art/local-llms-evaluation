package org.jsoup.helper;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import java.net.URL;
import java.util.List;

public class GeneratedTestBuildUrlWithEmptyString {

    @Test
    public void testBuildUrlWithEmptyString() {
        String url = "http://example.com";

        UrlBuilder builder = new UrlBuilder(url);
        List<UrlBuilder.KeyVal> kvList = List.of(
                new UrlBuilder.KeyVal("", "")
        );
        builder.appendKeyAndValue(kvList);

        URL expectedUrl = new URL("");
        assertThat(builder.build(), is(expectedUrl));
    }

}