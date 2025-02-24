package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.helper.DataUtil;
import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.jsoup.helper.HttpConnection;
import org.jsoup.Connection.Method;
import org.jsoup.Connection.KeyVal;
import org.jsoup.Connection.Request;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.net.URL;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.URI;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAppendKeyValWithEncodedTest {

    @Test
    public void appendKeyValWithEncodedTest() throws Exception {
        URL url = new URL("http://www.example.com");
        UrlBuilder urlBuilder = new UrlBuilder(url);
        KeyVal kv = new KeyVal("key", "value", true);
        urlBuilder.appendKeyVal(kv);
        assertEquals("key=value", urlBuilder.query().toString());
    }

}