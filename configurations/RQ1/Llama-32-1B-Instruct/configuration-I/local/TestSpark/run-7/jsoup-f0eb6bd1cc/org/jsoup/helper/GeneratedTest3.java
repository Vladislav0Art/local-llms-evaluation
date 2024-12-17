package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;

import javax.annotation.Nullable;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedTest3 {

    public static void main(String[] args) throws Exception {
        TestUrlBuilder1.test();
        TestUrlBuilder2.test();
        // ... add more test methods here
    }
}

class TestUrlBuilder1 {

    @Test
    public void test3() {
        URLBuilder urlBuilder = new UrlBuilder(new URL("https://example.com/path?query=value"));
        try {
            URI uri = new URI(urlBuilder.build());
            assert uri.toString().contains("?query=");
        } catch (URISyntaxException e) {
            // Expected
        }
    }

}