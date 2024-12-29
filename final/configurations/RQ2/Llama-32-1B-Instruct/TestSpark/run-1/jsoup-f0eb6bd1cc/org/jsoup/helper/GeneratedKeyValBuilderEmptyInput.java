package org.jsoup.helper;

import org.jsoup.helper.*;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedKeyValBuilderEmptyInput {

    private final UrlBuilder builder = new UrlBuilder(null);

    @Test
    public void keyValBuilderEmptyInput() {
        assertEquals("", builder.build());
    }

}