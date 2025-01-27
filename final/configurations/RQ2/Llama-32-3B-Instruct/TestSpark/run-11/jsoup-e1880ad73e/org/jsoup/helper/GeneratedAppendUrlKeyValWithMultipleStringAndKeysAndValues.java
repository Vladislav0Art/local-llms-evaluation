package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.mockito.Mockito;
import org.jsoup.internal.StringUtil;

import javax.annotation.Nullable;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedAppendUrlKeyValWithMultipleStringAndKeysAndValues {

    @Test
    public void appendUrlKeyValWithMultipleStringAndKeysAndValues() throws UnsupportedEncodingException {
        Connection.KeyVal kv1 = Mockito.mock(Connection.KeyVal.class);
        kv1.setValue("a");
        Connection.KeyVal kv2 = Mockito.mock(Connection.KeyVal.class);
        kv2.setValue("b");
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendUrlKeyVal(kv1);
        builder.appendUrlKeyVal(kv2);
        String result = builder.build();
        assertNotNull(result);
    }

}