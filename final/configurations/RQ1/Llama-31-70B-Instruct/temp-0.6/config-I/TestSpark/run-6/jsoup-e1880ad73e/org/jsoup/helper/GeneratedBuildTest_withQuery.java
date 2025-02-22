package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.URL;

public class GeneratedBuildTest_withQuery {

    @Test
    public void buildTest_withQuery() throws Exception {
        URL inputUrl = new URL("https://www.example.com/path?query=value#fragment");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.appendKeyVal(new Connection.KeyVal("key", "value"));
        URL outputUrl = builder.build();
        assertEquals("https://www.example.com/path?query=value&key=value#fragment", outputUrl.toString());
    }

}