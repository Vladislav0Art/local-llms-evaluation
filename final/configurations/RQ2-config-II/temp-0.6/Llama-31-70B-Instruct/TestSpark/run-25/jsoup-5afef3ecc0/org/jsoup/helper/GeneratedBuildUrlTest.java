package org.jsoup.helper;

import org.junit.Before;
import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class GeneratedBuildUrlTest {

    private UrlBuilder urlBuilder;

    @Before
    public void setup() {
        urlBuilder = new UrlBuilder();
    }

    @Test
    public void buildUrlTest() throws UnsupportedEncodingException {
        URL inputUrl = new URL("http://www.example.com/index.html");
        urlBuilder.setBaseUrl(inputUrl);

        List<Connection.KeyVal> queryParams = new ArrayList<>();
        queryParams.add(new Connection.KeyVal("param1", "value1", Connection.KeyVal.ParamType.URL_QUERY_STRING));
        queryParams.add(new Connection.KeyVal("param2", "value2", Connection.KeyVal.ParamType.URL_QUERY_STRING));
        urlBuilder.setQueryParams(queryParams);

        URL expectedUrl = new URL("http://www.example.com/index.html?param1=value1&param2=value2");
        assertEquals(expectedUrl, urlBuilder.build());
    }

}