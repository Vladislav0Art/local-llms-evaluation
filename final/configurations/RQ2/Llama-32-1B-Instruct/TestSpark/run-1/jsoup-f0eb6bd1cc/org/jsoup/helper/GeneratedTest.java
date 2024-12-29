package org.jsoup.helper;

import org.jsoup.helper.*;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    private final UrlBuilder builder = new UrlBuilder(null);

    @Test
    public void urlBuilderBuild() {
        assertEquals("https://example.com/path", builder.build());
    }

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

    @Test
    public void appendKeyValFailure() {
        URL inputUrl = mock(URI.class);

        builder.appendKeyVal(new KeyVal.Builder().setUrl(inputUrl).setValue(null));

        verifyNoMoreInteractions(builder, inputUrl);
    }

    @Test
    public void keyValBuilderEmptyInput() {
        assertEquals("", builder.build());
    }

    @Test
    public void keyValBuilderNullInput() {
        try {
            builder.appendKeyVal(new KeyVal.Builder().setUrl(null).build());
            fail("Expected an exception to be thrown");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

    @Test
    public void keyValBuilderMalformedInput() {
        URL inputUrl = mock(URI.class);

        builder.appendKeyVal(new KeyVal.Builder().setUrl(inputUrl).setValue("value").build());

        verifyNoMoreInteractions(builder, inputUrl);
        when(inputUrl.getScheme()).thenReturn("https");
        when(inputUrl.getHost()).thenReturn("example.com");
        when(inputUrl.getPath()).thenReturn("/path");
    }

    @Test
    public void keyValBuilderInvalidInput() {
        URL inputUrl = mock(URI.class);

        builder.appendKeyVal(new KeyVal.Builder().setUrl(inputUrl).setValue("value"));

        verifyNoMoreInteractions(builder, inputUrl);
        when(inputUrl.getScheme()).thenReturn("invalid");
        when(inputUrl.getHost()).thenReturn("example.com");
        when(inputUrl.getPath()).thenReturn("/path");
    }

    @Test
    public void keyValBuilderUnsupportedEncoding() {
        URL inputUrl = mock(URI.class);

        builder.appendKeyVal(new KeyVal.Builder().setUrl(inputUrl).setValue("value"));

        verifyNoMoreInteractions(builder, inputUrl);
        when(inputUrl.getScheme()).thenReturn("https");
        when(inputUrl.getHost()).thenReturn("example.com");
        when(inputUrl.getPath()).thenReturn("/path");
    }

    @Test
    public void keyValBuilderNullKey() {
        try {
            builder.appendKeyVal(new KeyVal.Builder().setUrl(null).setValue("value"));
            fail("Expected an exception to be thrown");
        } catch (UnsupportedEncodingException e) {
            // expected
        }
    }

    @Test
    public void appendKeyValMalformedKey() {
        URL inputUrl = mock(URI.class);

        builder.appendKeyVal(new KeyVal.Builder().setUrl(inputUrl).setValue("value").build());

        verifyNoMoreInteractions(builder, inputUrl);
        when(inputUrl.getScheme()).thenReturn("https");
        when(inputUrl.getHost()).thenReturn("example.com");
        when(inputUrl.getPath()).thenReturn("/path");
    }

    @Test
    public void appendKeyValMissingValue() {
        URL inputUrl = mock(URI.class);

        builder.appendKeyVal(new KeyVal.Builder().setUrl(inputUrl));

        verifyNoMoreInteractions(builder, inputUrl);
        when(inputUrl.getScheme()).thenReturn("https");
        when(inputUrl.getHost()).thenReturn("example.com");
        when(inputUrl.getPath()).thenReturn("/path");
    }

    @Test
    public void appendKeyValMissingUrl() {
        URL inputUrl = null;

        builder.appendKeyVal(new KeyVal.Builder().setUrl(inputUrl));

        verifyNoMoreInteractions(builder, inputUrl);
    }

}