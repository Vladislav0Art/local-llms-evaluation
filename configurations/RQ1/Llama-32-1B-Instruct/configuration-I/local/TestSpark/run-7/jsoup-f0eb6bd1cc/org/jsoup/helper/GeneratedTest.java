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

public class GeneratedTest {

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

    @Test
    public void test4() {
        String q1 = "key1=value1";
        URL u1 = new UrlBuilder("https://example.com/path?query=" + q1)
                .build();

        try {
            URI uri1 = new URI(u1.getProtocol(), u1.getUserInfo(), IDN.toASCII(decodePart(u1.getHost())), u1.getPort(), null, null, null);
            assert uri1.toString().contains("?key1=");
        } catch (URISyntaxException e) {
            // Expected
        }

        String q2 = "key2=value2";
        URLBuilder urlBuilder = new UrlBuilder("https://example.com/path?query=" + q2);

        try {
            URI uri2 = new URI(urlBuilder.build());
            assert uri2.toString().contains("?key2=");
        } catch (URISyntaxException e) {
            // Expected
        }

        URL u2 = new UrlBuilder("https://example.com/path")
                .build();

        URI uri3 = new URI(u2.getProtocol(), u2.getUserInfo(), IDN.toASCII(decodePart(u2.getHost())), u2.getPort(), null, null, null);
        assert uri3.toString().contains("?ref=");
    }
}

@Test
public void test5() {
    String q1 = "key1=value1";
    URL u1 = new UrlBuilder("https://example.com/path?query=" + q1)
            .build();

    try {
        URI uri1 = new URI(u1.getProtocol(), u1.getUserInfo(), IDN.toASCII(decodePart(u1.getHost())), u1.getPort(), null, null, null);
        assert uri1.toString().contains("?key1=");
    } catch (URISyntaxException e) {
        // Expected
    }

    String q2 = "key2=value2";
    URLBuilder urlBuilder = new UrlBuilder("https://example.com/path?query=" + q2);

    try {
        URI uri2 = new URI(urlBuilder.build());
        assert uri2.toString().contains("?key2=");
    } catch (URISyntaxException e) {
        // Expected
    }

    URL u1 = new UrlBuilder("https://example.com/path")
            .build();

    URI uri3 = new URI(u1.getProtocol(), u1.getUserInfo(), IDN.toASCII(decodePart(u1.getHost())), u1.getPort(), null, null, null);
    assert uri3.toString().contains("?ref=");
}

}