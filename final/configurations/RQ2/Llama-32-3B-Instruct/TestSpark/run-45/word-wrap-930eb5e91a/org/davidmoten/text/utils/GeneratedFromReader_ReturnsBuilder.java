package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedFromReader_ReturnsBuilder {

    private void setupMockito() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void fromReader_ReturnsBuilder() {
        assertSame(WordWrap.Builder.class, WordWrap.from(reader).getClass());
    }

}