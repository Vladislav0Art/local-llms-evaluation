package org.jsoup.helper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedAppendFragmentWithEmptyValueTest {

    @Mock
    private URL inputUrl;

    public UrlBuilderTest() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void appendFragmentWithEmptyValueTest() throws UnsupportedEncodingException {
        Connection.KeyVal kv = mock(Connection.KeyVal.class);
        when(kv.getKey()).thenReturn("fragment");
        when(kv.getValue()).thenReturn("");
        UrlBuilder builder = new UrlBuilder(inputUrl);
        builder.appendKeyVal(kv);
        assertEquals("example.com", inputUrl.toString());
    }

}