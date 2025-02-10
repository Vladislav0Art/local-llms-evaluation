package org.jsoup.helper;

import org.jsoup.Connection;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedBuilderInitializedWithUrl {

    @Test
    public void builderInitializedWithUrl() {
        UrlBuilder builder = new UrlBuilder(new URL("https://example.com"));
        assertNotNull(builder);
    }

}