package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedFromCharSequence_ReturnsBuilder {

    private void setupMockito() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void fromCharSequence_ReturnsBuilder() {
        String text = "Hello World";
        assertSame(WordWrap.Builder.class, WordWrap.from(text).getClass());
    }

}