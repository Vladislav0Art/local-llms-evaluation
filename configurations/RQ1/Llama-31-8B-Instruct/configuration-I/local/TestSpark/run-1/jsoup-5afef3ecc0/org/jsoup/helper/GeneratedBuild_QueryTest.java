package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuild_QueryTest {

    @InjectMocks
    private UrlBuilder urlBuilder;

    @Test
    public void build_QueryTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://example.com/path");
        urlBuilder = new UrlBuilder(inputUrl);
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));
        URL result = urlBuilder.build();
        assertNotNull(result);
        assertEquals("http://example.com/path?key=value", result.toString());
    }

}