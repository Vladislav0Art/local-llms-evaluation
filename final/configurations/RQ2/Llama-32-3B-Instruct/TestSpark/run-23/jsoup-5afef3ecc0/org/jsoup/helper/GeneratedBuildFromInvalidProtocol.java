package org.jsoup.helper;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class GeneratedBuildFromInvalidProtocol {

    @Test
    public void buildFromInvalidProtocol() {
        String input = "invalid://example.com";
        UrlBuilder builder = new UrlBuilder(input);
        builder.build();
    }

}