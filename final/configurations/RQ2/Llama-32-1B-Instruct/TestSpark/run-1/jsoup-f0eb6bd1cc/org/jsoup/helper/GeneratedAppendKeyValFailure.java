package org.jsoup.helper;

import org.jsoup.helper.*;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedAppendKeyValFailure {

    private final UrlBuilder builder = new UrlBuilder(null);

    @Test
    public void appendKeyValFailure() {
        URL inputUrl = mock(URI.class);

        builder.appendKeyVal(new KeyVal.Builder().setUrl(inputUrl).setValue(null));

        verifyNoMoreInteractions(builder, inputUrl);
    }

}