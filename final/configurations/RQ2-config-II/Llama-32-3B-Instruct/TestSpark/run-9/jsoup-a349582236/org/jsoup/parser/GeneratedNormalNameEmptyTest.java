package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNormalNameEmptyTest {

    @Mock
    private ParseSettings settings;

    @Test
    public void normalNameEmptyTest() {
        //Arrange
        Tag tag = new Tag();
        String tagName = "";

        //Act & Assert
        org.junit.Assert.assertEquals("", tag.normalName());
    }

}