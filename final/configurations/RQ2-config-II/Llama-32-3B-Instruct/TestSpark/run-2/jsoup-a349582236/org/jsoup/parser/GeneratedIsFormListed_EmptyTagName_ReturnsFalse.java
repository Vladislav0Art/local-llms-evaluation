package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedIsFormListed_EmptyTagName_ReturnsFalse {

    @Test
    public void isFormListed_EmptyTagName_ReturnsFalse() {
        // Arrange and Act
        String tagName = "";
        Tag tag = new Tag(tagName);

        // Assert
        assertFalse(tag.isFormListed());
    }

}