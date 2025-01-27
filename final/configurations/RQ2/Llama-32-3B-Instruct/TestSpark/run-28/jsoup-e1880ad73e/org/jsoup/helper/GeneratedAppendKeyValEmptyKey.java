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

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAppendKeyValEmptyKey {

    public interface KeyVal {
        boolean of(String key, String value);
    }

    @Test
    public void appendKeyValEmptyKey() {
        UrlBuilder builder = new UrlBuilder(new URL("http://example.com"));
        assertFalse(builder.appendKeyVal(Connection.KeyVal.of("", "")).isSuccess());
    }

}