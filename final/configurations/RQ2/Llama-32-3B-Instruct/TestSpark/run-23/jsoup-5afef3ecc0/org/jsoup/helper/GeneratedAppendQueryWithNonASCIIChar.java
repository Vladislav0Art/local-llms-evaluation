package org.jsoup.helper;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class GeneratedAppendQueryWithNonASCIIChar {

    @Test
    public void appendQueryWithNonASCIIChar() {
        String input = "http://example.com";
        Connection.KeyVal kv = new Connection.KeyVal();
        kv.setKey(StringUtil.UTF_8, StringUtil.UTF_8);
        UrlBuilder builder = new UrlBuilder(input);
        builder.appendKeyVal(kv);
        URL url = builder.build();
        assertThat(url.getProtocol(), is("http"));
    }

}