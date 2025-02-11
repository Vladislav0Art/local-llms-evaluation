package org.jsoup.helper;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.jsoup.helper.DataUtil.UTF_8;

public class GeneratedAppendKeyValToQueryBuilder {

    @Mock
    private Connection connection;

    @Test
    public void appendKeyValToQueryBuilder() throws Exception {
        // given
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        Connection.KeyVal keyVal = new Connection.KeyVal("key", "value");

        // when
        urlBuilder.appendKeyVal(keyVal);

        // then
        Mockito.verify(urlBuilder.q).append(URLEncoder.encode("key", UTF_8.name()));
    }

}