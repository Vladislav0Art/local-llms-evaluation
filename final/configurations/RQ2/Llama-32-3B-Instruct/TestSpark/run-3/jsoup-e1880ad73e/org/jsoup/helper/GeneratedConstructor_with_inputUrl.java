package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.net.MalformedURLException;
import java.util.Map;

public class GeneratedConstructor_with_inputUrl {

    @Test
    public void constructor_with_inputUrl() {
        String inputUrl = "http://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(new URL(inputUrl));
        assertThat(urlBuilder, is(null));
    }

}