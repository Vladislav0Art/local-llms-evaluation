package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedIsWhitespace_ThrowsNullPointerException {

    private void setupMockito() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void isWhitespace_ThrowsNullPointerException() {
        assertNull(WordWrap.isWhitespace(null));
    }

}