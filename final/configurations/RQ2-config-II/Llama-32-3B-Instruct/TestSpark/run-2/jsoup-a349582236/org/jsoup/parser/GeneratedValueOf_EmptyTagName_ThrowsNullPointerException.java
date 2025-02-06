package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedValueOf_EmptyTagName_ThrowsNullPointerException {

    @Test
    public void valueOf_EmptyTagName_ThrowsNullPointerException() {
        // Arrange and Act and Assert
        assertThrows(NullPointerException.class, () -> Tag.valueOf(""));
    }

}