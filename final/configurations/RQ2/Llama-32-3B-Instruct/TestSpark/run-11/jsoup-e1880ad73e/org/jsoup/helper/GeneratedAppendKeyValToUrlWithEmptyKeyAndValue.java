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

public class GeneratedAppendKeyValToUrlWithEmptyKeyAndValue {

    @Test
    public void appendKeyValToUrlWithEmptyKeyAndValue() throws UnsupportedEncodingException {
        Connection.KeyVal kv = Mockito.mock(Connection.KeyVal.class);
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        builder.appendKeyVal(kv);
        String result = builder.build();
        assertNotNull(result);
    }

}