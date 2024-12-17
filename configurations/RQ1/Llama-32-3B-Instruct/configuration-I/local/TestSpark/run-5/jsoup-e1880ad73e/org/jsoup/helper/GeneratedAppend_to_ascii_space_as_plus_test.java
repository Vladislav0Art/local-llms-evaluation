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

public class GeneratedAppend_to_ascii_space_as_plus_test {

    @Test
    public void append_to_ascii_space_as_plus_test() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        UrlBuilder.UrlBuilderTestHelper.appendToAscii(sb, true, "path/àb/cèd");
        assertEquals("%20%20%C3%80%C3%82%C3%A9%C3%B4%C3%83%C3%85%C3%86%C3%87", sb.toString());
    }

}