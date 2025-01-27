package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedFromClasspathUtf8_StringResource_ReturnsBuilder {

    @Mock
    private Reader reader;

    public static class Builder {
        // implementation
    }

    @Test
    public void fromClasspathUtf8_StringResource_ReturnsBuilder() {
        String resource = "resource";
        Preconditions.checkNotNull(WordWrap.Builder.fromClasspathUtf8(resource), "Expected a non-null value");
    }

}