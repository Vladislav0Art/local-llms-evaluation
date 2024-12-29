package org.jsoup.helper;

import org.jsoup.helper.*;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedAppendKeyValMissingUrl {

    private final UrlBuilder builder = new UrlBuilder(null);

    @Test
    public void appendKeyValMissingUrl() {
        URL inputUrl = null;

        builder.appendKeyVal(new KeyVal.Builder().setUrl(inputUrl));

        verifyNoMoreInteractions(builder, inputUrl);
    }

}