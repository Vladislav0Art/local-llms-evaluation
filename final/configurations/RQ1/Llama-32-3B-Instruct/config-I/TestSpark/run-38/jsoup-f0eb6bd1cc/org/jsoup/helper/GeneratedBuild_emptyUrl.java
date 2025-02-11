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
public class GeneratedBuild_emptyUrl {

    @Mock
    private Connection.KeyVal kv;

    @InjectMocks
    private UrlBuilder urlBuilder;

    @Test
    public void build_emptyUrl() {
        // given
        URL u = null;
        String s = "";

        // when
        urlBuilder.u = u;
        urlBuilder.q = null;
        urlBuilder.build();

        // then
        assert urlBuilder.u == null;
        assert urlBuilder.q == null;
    }

}