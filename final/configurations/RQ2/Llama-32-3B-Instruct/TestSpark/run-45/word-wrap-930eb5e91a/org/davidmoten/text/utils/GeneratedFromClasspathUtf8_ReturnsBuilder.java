package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedFromClasspathUtf8_ReturnsBuilder {

    private void setupMockito() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void fromClasspathUtf8_ReturnsBuilder() {
        assertSame(WordWrap.Builder.class, WordWrap.fromClasspathUtf8("resource").getClass());
    }

}