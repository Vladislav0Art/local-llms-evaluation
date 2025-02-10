package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedIsWhitespace_WithSpaceReturnChars_ReturnsTrue {

    private void setupMockito() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void isWhitespace_WithSpaceReturnChars_ReturnsTrue() {
        assertTrue(WordWrap.isWhitespace("   "));
    }

}