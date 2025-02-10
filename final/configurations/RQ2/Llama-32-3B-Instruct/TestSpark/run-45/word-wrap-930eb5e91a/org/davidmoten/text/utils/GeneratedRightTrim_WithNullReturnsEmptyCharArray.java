package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class GeneratedRightTrim_WithNullReturnsEmptyCharArray {

    private void setupMockito() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void rightTrim_WithNullReturnsEmptyCharArray() {
        char[] expected = new char[0];
        assertEquals(expected, WordWrap.rightTrim(null));
    }

}