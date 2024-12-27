package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URL;

public class GeneratedBuild_InvalidUrl_Test {

    @Test
    public void build_InvalidUrl_Test() throws Exception {
        URL inputUrl = new URL("http://this is not a url");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.build();
    }

}