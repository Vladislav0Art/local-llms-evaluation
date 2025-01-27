package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import static org.junit.Assert.*;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class GeneratedAppendKeyVal_NoKeyOrValue {

    @Test
    public void appendKeyVal_NoKeyOrValue() throws UnsupportedEncodingException {
        Connection.KeyVal kv = Connection.KeyVal.empty();
        UrlBuilder builder = new UrlBuilder(null);
        builder.appendKeyVal(kv);
        assertNull(kv.getKey());
        assertNull(kv.getValue());
    }

}