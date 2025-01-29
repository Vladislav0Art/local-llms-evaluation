package org.jsoup.helper;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedTest {

    @Mock
    private Connection.KeyVal keyValMock;

    public String buildUrl() throws UnsupportedEncodingException {
        Map<String, String> keyVals = new HashMap<>();
        keyVals.put("c", "3");
        urlBuilderMock.appendKeyVal(keyVals);
        return getExpectedString(keyVals);
    }

}