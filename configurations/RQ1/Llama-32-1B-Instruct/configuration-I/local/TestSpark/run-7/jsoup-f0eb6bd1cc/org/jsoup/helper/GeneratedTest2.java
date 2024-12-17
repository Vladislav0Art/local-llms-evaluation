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

public class GeneratedTest2 {

    public static void main(String[] args) throws Exception {
        TestUrlBuilder1.test();
        TestUrlBuilder2.test();
        // ... add more test methods here
    }
}

class TestUrlBuilder1 {

    @Test
    public void test2() {
        String q = "key=value";
        URLBuilder urlBuilder = new UrlBuilder("https://example.com/path?query=" + q);

        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
        // assert that all queries are added correctly
        URL u = urlBuilder.build();
        try {
            URI uri = new URI(u.getProtocol(), u.getUserInfo(), IDN.toASCII(decodePart(u.getHost())), u.getPort(), null, null, null);
            assert uri.toString().contains("?query=");
        } catch (URISyntaxException e) {
            // Expected
        }
    }

}