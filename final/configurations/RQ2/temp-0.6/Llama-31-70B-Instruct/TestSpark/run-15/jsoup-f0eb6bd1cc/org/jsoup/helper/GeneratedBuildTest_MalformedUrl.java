package org.jsoup.helper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;

import java.net.URL;
import java.net.MalformedURLException;

public class GeneratedBuildTest_MalformedUrl {

    @Test
    public void buildTest_MalformedUrl() throws MalformedURLException {
        URL inputUrl = new URL("malformed_url");
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.build();
    }

}