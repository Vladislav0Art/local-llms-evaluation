package org.jsoup.helper;

import org.jsoup.helper.*;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedAppendKeyValSuccess {

    private final UrlBuilder builder = new UrlBuilder(null);

    @Test
    public void appendKeyValSuccess() {
        URL inputUrl = mock(URI.class);
        String key = "test";
        String value = "value";

        builder.appendKeyVal(new KeyVal.Builder().setUrl(inputUrl).setValue(key).build());

        verifyNoMoreInteractions(builder, inputUrl);
        when(inputUrl.getScheme()).thenReturn("https");
        when(inputUrl.getHost()).thenReturn("example.com");
        when(inputUrl.getPath()).thenReturn("/path");
    }

}