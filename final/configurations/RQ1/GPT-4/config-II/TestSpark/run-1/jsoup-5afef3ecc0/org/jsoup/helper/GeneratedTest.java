package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.UrlBuilder;
import org.mockito.Mockito;
import org.junit.Test;

import java.net.URL;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void UrlBuilderConstructorTest() {
        try {
            URL url = new URL("https://test.com?param=value");
            UrlBuilder builder = new UrlBuilder(url);
            assertEquals("test.com", builder.u.getHost());
            assertEquals("param=value", builder.q.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void buildTest() {
        try {
            URL url = new URL("https://test.com?param=value#section");
            UrlBuilder builder = new UrlBuilder(url);
            URL result = builder.build();

            assertEquals("https://test.com/?param=value#section", result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void appendKeyValTest() {
        try {
            URL url = new URL("https://test.com");
            UrlBuilder builder = new UrlBuilder(url);
            Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
            Mockito.when(kv.key()).thenReturn("newparam");
            Mockito.when(kv.value()).thenReturn("newvalue");

            builder.appendKeyVal(kv);
            assertEquals("newparam=newvalue", builder.q.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void decodePartUnsupportedEncodingExceptionTest() throws Exception {
        UrlBuilder.decodePart("\u0080");
    }

    @Test
    public void normalizeQueryTest() {
        String result = UrlBuilder.normalizeQuery("space between words");
        assertEquals("space+between+words", result);
    }

    @Test
    public void normalizeRefTest() {
        String result = UrlBuilder.normalizeRef("space between words");
        assertEquals("space%20between%20words", result);
    }

}