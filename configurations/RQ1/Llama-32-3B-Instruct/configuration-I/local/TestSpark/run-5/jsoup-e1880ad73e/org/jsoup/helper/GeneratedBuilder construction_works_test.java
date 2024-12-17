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

public class GeneratedBuilder construction_works_test {

    @Test
    public void builder

    construction_works_test() {
        URL u = new URL("http://example.com/path?query=value#fragment");
        UrlBuilder ub = new UrlBuilder(u);
        assertNotNull(ub.u);
        assertNull(ub.q);
    }

}