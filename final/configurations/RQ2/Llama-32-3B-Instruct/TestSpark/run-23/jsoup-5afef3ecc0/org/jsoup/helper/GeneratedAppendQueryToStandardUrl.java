package org.jsoup.helper;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class GeneratedAppendQueryToStandardUrl {

    @Test
    public void appendQueryToStandardUrl() {
        String input = "http://example.com";
        Connection.KeyVal kv = new Connection.KeyVal();
        kv.setKey("q", "v");
        UrlBuilder builder = new UrlBuilder(input);
        builder.appendKeyVal(kv);
        URL url = builder.build();
        assertThat(url.getProtocol(), is("http"));
    }

}