package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedSetSelfClosing_NonEmptyTagName_ThrowsNullPointerException {

    @Test
    public void setSelfClosing_NonEmptyTagName_ThrowsNullPointerException() {
        // Arrange and Act and Assert
        assertThrows(NullPointerException.class, () -> new Tag("").setSelfClosing());
    }

}