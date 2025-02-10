package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedIsWhitespace_WithChar_ReturnsFalse {

    private void setupMockito() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void isWhitespace_WithChar_ReturnsFalse() {
        assertFalse(WordWrap.isWhitespace("a"));
    }

}