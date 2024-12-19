package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedNewUrlBuilder_fromInvalidUrl_throwsException {

    @Mock
    private URL inputUrl;

    @org.junit.Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void newUrlBuilder_fromInvalidUrl_throwsException() {
        when(inputUrl.toString()).thenThrow(UnsupportedEncodingException.class);
        assertThrows(UnsupportedEncodingException.class, () -> new UrlBuilder(inputUrl).build());
    }

}