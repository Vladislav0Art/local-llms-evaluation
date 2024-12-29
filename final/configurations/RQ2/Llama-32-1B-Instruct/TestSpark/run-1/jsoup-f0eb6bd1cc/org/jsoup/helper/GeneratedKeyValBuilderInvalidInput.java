package org.jsoup.helper;

import org.jsoup.helper.*;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedKeyValBuilderInvalidInput {

    private final UrlBuilder builder = new UrlBuilder(null);

    @Test
    public void keyValBuilderInvalidInput() {
        URL inputUrl = mock(URI.class);

        builder.appendKeyVal(new KeyVal.Builder().setUrl(inputUrl).setValue("value"));

        verifyNoMoreInteractions(builder, inputUrl);
        when(inputUrl.getScheme()).thenReturn("invalid");
        when(inputUrl.getHost()).thenReturn("example.com");
        when(inputUrl.getPath()).thenReturn("/path");
    }

}