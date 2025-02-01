package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.URL;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void buildTest() {
        try {
            URL inputUrl = new URL("http://www.google.com?query=test");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            assertTrue(urlBuilder.build().toString().equals("http://www.google.com?query=test"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void appendKeyValTest() {
        try {
            URL inputUrl = new URL("http://www.google.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            Connection.KeyVal kv = mock(Connection.KeyVal.class);
            when(kv.key()).thenReturn("key");
            when(kv.value()).thenReturn("value");
            urlBuilder.appendKeyVal(kv);
            assertTrue(urlBuilder.u.toString().equals("http://www.google.com?query=test"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void decodePartTest() {
        try {
            URL inputUrl = new URL("http://www.example.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            String encodedPart = "encodedPart";
            String result = urlBuilder.decodePart(encodedPart);
            assertTrue(result.equals(URLDecoder.decode(encodedPart, UTF_8.name()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void appendToAsciiTest() {
        try {
            URL inputUrl = new URL("http://www.example.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            StringBuilder sb = StringUtil.borrowBuilder();
            urlBuilder.appendToAscii("abc", false, sb);
            assertTrue(sb.toString().equals("abc"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void appendToAsciiWithSpaceTest() {
        try {
            URL inputUrl = new URL("http://www.example.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            StringBuilder sb = StringUtil.borrowBuilder();
            urlBuilder.appendToAscii("a b", true, sb);
            assertTrue(sb.toString().equals("a+b"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void appendToAsciiWithSpecialCharTest() {
        try {
            URL inputUrl = new URL("http://www.example.com");
            UrlBuilder urlBuilder = new UrlBuilder(inputUrl);
            StringBuilder sb = StringUtil.borrowBuilder();
            urlBuilder.appendToAscii("あ", false, sb);
            assertTrue(URLEncoder.encode("あ", UTF_8.name()).equals(sb.toString()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}