package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.net.URL;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedShouldAppendKeyValWithExistingQuery {

    private UrlBuilder urlBuilder;
    @Mock
    private URL mockUrl;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        urlBuilder = new UrlBuilder(mockUrl);
    }

    @Test
    public void shouldAppendKeyValWithExistingQuery() throws UnsupportedEncodingException {
        urlBuilder.q = new StringBuilder("existing=query");
        urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"));

        assertEquals("existing=query&key=value", urlBuilder.q.toString());
    }

}