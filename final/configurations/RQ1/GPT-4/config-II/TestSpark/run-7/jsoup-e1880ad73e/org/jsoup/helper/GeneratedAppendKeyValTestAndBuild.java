package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.net.URL;

public class GeneratedAppendKeyValTestAndBuild {

    @Test
    public void appendKeyValTestAndBuild() throws Exception {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://google.com/search?q=jsoup"));
        urlBuilder.appendKeyVal(new Connection.KeyVal("language", "java"));
        URL url = urlBuilder.build();
        Assert.assertEquals("https://google.com/search?q=jsoup&language=java", url.toString());
    }

}