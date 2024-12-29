package org.jsoup.helper;

import org.jsoup.helper.*;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedUrlBuilderBuild {

    private final UrlBuilder builder = new UrlBuilder(null);

    @Test
    public void urlBuilderBuild() {
        assertEquals("https://example.com/path", builder.build());
    }

}