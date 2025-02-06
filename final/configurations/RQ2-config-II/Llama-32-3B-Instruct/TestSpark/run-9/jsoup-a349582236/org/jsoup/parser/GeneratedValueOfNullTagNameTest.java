package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValueOfNullTagNameTest {

    @Mock
    private ParseSettings settings;

    @Test
    public void valueOfNullTagNameTest() {
        //Arrange
        Tag tag = null;
        String tagName = null;

        //Act & Assert
        org.junit.Assert.assertNull(Tag.valueOf(tagName));
    }

}