package org.jsoup.helper;

import org.jsoup.helper.*;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedAppendKeyValMissingValue {

    private final UrlBuilder builder = new UrlBuilder(null);

    @Test
    public void appendKeyValMissingValue() {
        URL inputUrl = mock(URI.class);

        builder.appendKeyVal(new KeyVal.Builder().setUrl(inputUrl));

        verifyNoMoreInteractions(builder, inputUrl);
        when(inputUrl.getScheme()).thenReturn("https");
        when(inputUrl.getHost()).thenReturn("example.com");
        when(inputUrl.getPath()).thenReturn("/path");
    }

}