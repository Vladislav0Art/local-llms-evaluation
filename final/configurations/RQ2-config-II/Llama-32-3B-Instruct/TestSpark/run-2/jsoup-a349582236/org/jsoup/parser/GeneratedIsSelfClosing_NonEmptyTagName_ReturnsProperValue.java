package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedIsSelfClosing_NonEmptyTagName_ReturnsProperValue {

    @Test
    public void isSelfClosing_NonEmptyTagName_ReturnsProperValue() {
        // Arrange and Act
        String tagName = "test";
        Tag tag = new Tag(tagName);

        // Assert
        assertTrue(tag.isSelfClosing());
    }

}