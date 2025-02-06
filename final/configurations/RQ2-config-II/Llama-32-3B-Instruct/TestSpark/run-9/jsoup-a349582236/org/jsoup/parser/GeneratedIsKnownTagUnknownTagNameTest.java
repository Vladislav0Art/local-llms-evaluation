package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsKnownTagUnknownTagNameTest {

    @Mock
    private ParseSettings settings;

    @Test
    public void isKnownTagUnknownTagNameTest() {
        //Arrange
        String tagName = "unknown";

        //Act & Assert
        org.junit.Assert.assertFalse(Tag.isKnownTag(tagName));
    }

}