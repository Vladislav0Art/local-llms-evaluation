package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.net.MalformedURLException;
import java.util.Map;

public class GeneratedBuild_without_appendKeyVal {

    @Test
    public void build_without_appendKeyVal() throws MalformedURLException {
        String inputUrl = "http://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(new URL(inputUrl));
        URL result = urlBuilder.build();
        assertThat(result.toString(), is(inputUrl));
    }

}