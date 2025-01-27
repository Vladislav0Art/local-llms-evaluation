package org.jsoup.helper;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class GeneratedNewUrlBuilderFromEmptyString {

    @Test
    public void newUrlBuilderFromEmptyString() {
        UrlBuilder builder = new UrlBuilder("");
        URL url = builder.build();
        assertThat(url, is(null));
    }

}