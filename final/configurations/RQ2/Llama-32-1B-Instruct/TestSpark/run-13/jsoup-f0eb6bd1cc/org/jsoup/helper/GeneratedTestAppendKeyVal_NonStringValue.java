package org.jsoup.helper;

import java.util.HashMap;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedTestAppendKeyVal_NonStringValue {

    @Mock
    private Connection.KeyVal keyValMock;

    @InjectMocks
    private UrlBuilder urlBuilderMock;

    @BeforeClass
    public static void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAppendKeyVal_NonStringValue() throws UnsupportedEncodingException {
        URL inputUrl = new URI("http://example.com/path?a=1&b=2");
        Map<String, String> keyVals = new HashMap<>();
        keyVals.put("c", "3");
        urlBuilderMock.appendKeyVal(keyVals);
    }

}