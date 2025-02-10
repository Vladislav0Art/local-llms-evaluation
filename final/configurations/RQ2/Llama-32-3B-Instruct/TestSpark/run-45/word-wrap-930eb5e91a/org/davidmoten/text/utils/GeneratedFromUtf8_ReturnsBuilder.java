package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedFromUtf8_ReturnsBuilder {

    private void setupMockito() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void fromUtf8_ReturnsBuilder() {
        String text = "Hello World";
        assertEquals(WordWrap.Builder.class, WordWrap.fromUtf8(text).getClass());
    }

}