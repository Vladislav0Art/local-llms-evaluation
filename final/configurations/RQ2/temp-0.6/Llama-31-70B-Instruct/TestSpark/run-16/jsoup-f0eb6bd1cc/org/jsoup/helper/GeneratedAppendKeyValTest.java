package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.helper.UrlBuilder;
import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;

import static org.junit.Assert.*;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.jsoup.helper.DataUtil.UTF_8;

import org.mockito.Mockito;

public class GeneratedAppendKeyValTest {

    @Test
    public void appendKeyValTest() throws UnsupportedEncodingException {
        Connection.KeyVal keyVal = Mockito.mock(Connection.KeyVal.class);
        UrlBuilder urlBuilder = new UrlBuilder(null);
        urlBuilder.appendKeyVal(keyVal);
        Mockito.verify(keyVal).key();
        Mockito.verify(keyVal).value();
    }

}