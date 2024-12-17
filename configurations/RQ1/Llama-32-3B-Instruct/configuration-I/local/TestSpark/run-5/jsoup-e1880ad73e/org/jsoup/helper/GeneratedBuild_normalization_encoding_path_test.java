package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedBuild_normalization_encoding_path_test {

    @Test
    public void build_normalization_encoding_path_test() throws MalformedURLException, URISyntaxException {
        URL u = new URL("http://example.com/path?query=value#fragment");
        UrlBuilder ub = new UrlBuilder(u);
        UrlBuilder.UrlBuilderTestHelper.buildNormalizing(ub, "path/àb/cèd", "utf-8", 80);
    }

}