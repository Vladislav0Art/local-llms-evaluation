package org.jsoup.helper;

import org.jsoup.Connection.KeyVal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Connection.KeyVal kv;

    @InjectMocks
    private UrlBuilder urlBuilder;

    @Test
    public void build_emptyUrl() {
        // given
        URL u = null;
        String s = "";

        // when
        urlBuilder.u = u;
        urlBuilder.q = null;
        urlBuilder.build();

        // then
        assert urlBuilder.u == null;
        assert urlBuilder.q == null;
    }

    @Test
    public void build_withEmptyQuery() {
        // given
        URL u = new URL("https://a.com/path?query");
        String s = "";

        // when
        urlBuilder.u = u;
        urlBuilder.build();

        // then
        assert urlBuilder.u.getProtocol().equals("https");
        assert urlBuilder.u.getUserInfo() == null;
        assert urlBuilder.u.getHost().equals("a.com");
        assert urlBuilder.u.getPath().equals("/path");
        assert urlBuilder.u.getQuery().equals("");
    }

    @Test
    public void build_withNonAsciiHost() {
        // given
        URL u = new URL("https://ä.com/path?query");
        String s = "";

        // when
        urlBuilder.u = u;
        urlBuilder.build();

        // then
        assert urlBuilder.u.getProtocol().equals("https");
        assert urlBuilder.u.getUserInfo() == null;
        assert urlBuilder.u.getHost().equals("a.com"); // puny-coding
    }

    @Test
    public void build_withQuery() {
        // given
        URL u = new URL("https://a.com/path?query=abc&def=123");
        String s = "";

        // when
        urlBuilder.u = u;
        urlBuilder.build();

        // then
        assert urlBuilder.u.getProtocol().equals("https");
        assert urlBuilder.u.getUserInfo() == null;
        assert urlBuilder.u.getHost().equals("a.com");
        assert urlBuilder.u.getPath().equals("/path?query=abc&def=123");
    }

    @Test
    public void build_withFragment() {
        // given
        URL u = new URL("https://a.com/path?query#fragment");
        String s = "";

        // when
        urlBuilder.u = u;
        urlBuilder.build();

        // then
        assert urlBuilder.u.getProtocol().equals("https");
        assert urlBuilder.u.getUserInfo() == null;
        assert urlBuilder.u.getHost().equals("a.com");
        assert urlBuilder.u.getPath().equals("/path?query#fragment");
    }

    @Test
    public void appendKeyVal_emptyUrl() {
        // given
        Connection.KeyVal kv = new Connection.KeyVal();

        // when
        urlBuilder.appendKeyVal(kv);

        // then
        assert urlBuilder.q != null;
        assert urlBuilder.q.toString().equals("");
    }

    @Test
    public void appendKeyVal_notEmptyUrl() {
        // given
        Connection.KeyVal kv = new Connection.KeyVal();
        List<Connection.KeyVal> l = new ArrayList<>();
        l.add(new Connection.KeyVal());
        l.get(0).key = "abc";
        l.get(0).value = "def";

        // when
        urlBuilder.q = StringUtil.borrowBuilder();
        for (Connection.KeyVal c : l) {
            urlBuilder.appendKeyVal(c);
        }
        urlBuilder.appendKeyVal(kv);

        // then
        assert urlBuilder.q != null;
        assert urlBuilder.q.toString().equals("&abc=def&");
    }

    @Test
    public void decodePart_emptyString() throws UnsupportedEncodingException {
        String s = "";
        String expected = "";

        // when
        String actual = UrlBuilder.decodePart(s);

        // then
        assert actual.equals(expected);
    }

    @Test
    public void decodePart_nonEmptyString() throws UnsupportedEncodingException {
        String s = "ä.com";
        String expected = "a.com";

        // when
        String actual = UrlBuilder.decodePart(s);

        // then
        assert actual.equals(expected);
    }

}