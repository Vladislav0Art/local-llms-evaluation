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

public class GeneratedTest1 {

    public static void main(String[] args) throws Exception {
        TestUrlBuilder1.test();
        TestUrlBuilder2.test();
        // ... add more test methods here
    }
}

class TestUrlBuilder1 {

    @Test
    public void test1() {
        StringBuilder q = StringUtil.borrowBuilder();

        new UrlBuilder("https://example.com/path?query=value#anchor").build()
                .appendKeyVal(new Connection.KeyVal("key", "value"))
                .assertFail("Expected Fail");

        URL u = new UrlBuilder("https://example.com/path?query=value#anchor")
                .build();
        // assert fail to match the expected URL
    }

}