package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValueOfUnknownTagNameTest {

    @Mock
    private ParseSettings settings;

    @Test
    public void valueOfUnknownTagNameTest() {
        //Arrange
        Tag tag = new Tag();
        String tagName = "unknown";

        //Act & Assert
        org.junit.Assert.assertFalse(Tag.isKnownTag(tagName));
    }

}