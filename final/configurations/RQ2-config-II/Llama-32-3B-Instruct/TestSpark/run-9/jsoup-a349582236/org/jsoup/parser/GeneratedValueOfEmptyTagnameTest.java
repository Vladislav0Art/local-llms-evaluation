package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValueOfEmptyTagnameTest {

    @Mock
    private ParseSettings settings;

    @Test
    public void valueOfEmptyTagnameTest() {
        //Arrange
        Tag tag = new Tag();
        String tagName = "";

        //Act & Assert
        org.junit.Assert.assertEquals(new Tag(), Tag.valueOf(tagName, settings));
    }

}