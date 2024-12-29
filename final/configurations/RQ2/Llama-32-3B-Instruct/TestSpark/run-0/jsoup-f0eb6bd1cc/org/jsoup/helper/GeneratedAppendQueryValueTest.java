package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedAppendQueryValueTest {

    @Mock
    private URL inputUrl;

    public UrlBuilderTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void appendQueryValueTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.getKey()).thenReturn("query");
        when(kv.getValue()).thenReturn("value");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.appendKeyVal(kv);
        assertEquals("example.com?query=value", inputUrl.toString());
    }

}