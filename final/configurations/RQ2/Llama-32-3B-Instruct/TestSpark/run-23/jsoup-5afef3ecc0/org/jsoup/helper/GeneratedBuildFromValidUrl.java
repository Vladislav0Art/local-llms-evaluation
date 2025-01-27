package org.jsoup.helper;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class GeneratedBuildFromValidUrl {

    @Test
    public void buildFromValidUrl() {
        String input = "http://example.com";
        UrlBuilder builder = new UrlBuilder(input);
        URL url = builder.build();
        assertThat(url, is(not(nullValue())));
    }

}