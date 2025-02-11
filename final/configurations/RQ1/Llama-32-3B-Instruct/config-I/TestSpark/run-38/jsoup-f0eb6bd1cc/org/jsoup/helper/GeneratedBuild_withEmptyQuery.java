package org.jsoup.helper;

import org.jsoup.Connection.KeyVal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedBuild_withEmptyQuery {

    @Mock
    private Connection.KeyVal kv;

    @InjectMocks
    private UrlBuilder urlBuilder;

    @Test
    public void build_withEmptyQuery() {
        // given
        URL u = new URL("https://a.com/path?query");
        String s = "";

        // when
        urlBuilder.u = u;
        urlBuilder.build();

        // then
        assert urlBuilder.u.getProtocol().equals("https");
        assert urlBuilder.u.getUserInfo() == null;
        assert urlBuilder.u.getHost().equals("a.com");
        assert urlBuilder.u.getPath().equals("/path");
        assert urlBuilder.u.getQuery().equals("");
    }

}