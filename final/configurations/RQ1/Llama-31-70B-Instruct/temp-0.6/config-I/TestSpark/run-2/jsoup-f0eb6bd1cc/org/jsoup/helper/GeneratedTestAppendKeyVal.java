package org.jsoup.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class GeneratedTestAppendKeyVal {

    @Mock
    URL url;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        UrlBuilder builder = new UrlBuilder(url);
        builder.appendKeyVal(new Connection.KeyVal("key", "value"));

        assertEquals("key=value", builder.q.toString());
    }

}