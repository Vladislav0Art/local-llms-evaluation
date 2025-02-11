package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedNormalizeQuery_withQueryString_ReturnsNormalizedString {

    @Test
    public void normalizeQuery_withQueryString_ReturnsNormalizedString() {
        String q = " foo=bar ";
        assertEquals("+foo=bar", UrlBuilder.normalizeQuery(q));
    }

}