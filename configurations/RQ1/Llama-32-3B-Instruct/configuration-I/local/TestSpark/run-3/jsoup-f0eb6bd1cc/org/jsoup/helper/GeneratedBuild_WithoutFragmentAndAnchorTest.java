package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedBuild_WithoutFragmentAndAnchorTest {

    @Test
    public void build_WithoutFragmentAndAnchorTest() {
        URL u = new URL("http://example.com/test");
        UrlBuilder builder = new UrlBuilder(u);
        assertEquals("http://example.com/test", ((URL) builder.build()).toString());
    }
}

public class ConnectionKeyVal {
    private String key;
    private String value;

    public ConnectionKeyVal(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConnectionKeyVal that = (ConnectionKeyVal) o;
        return Objects.equals(key, that.key) &&
                Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

}