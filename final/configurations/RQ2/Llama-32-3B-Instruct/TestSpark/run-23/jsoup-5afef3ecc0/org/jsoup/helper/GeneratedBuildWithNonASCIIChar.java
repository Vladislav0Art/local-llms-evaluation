package org.jsoup.helper;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class GeneratedBuildWithNonASCIIChar {

    @Test
    public void buildWithNonASCIIChar() {
        String input = "http://example.com";
        UrlBuilder builder = new UrlBuilder(input);
        URL url = builder.build();
        assertThat(url.getProtocol(), is("http"));
    }

}