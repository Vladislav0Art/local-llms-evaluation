package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedFormatAsBlockFalseTest {

    @Mock
    private ParseSettings settings;

    @Test
    public void formatAsBlockFalseTest() {
        //Arrange
        Tag tag = new Tag();
        boolean expected = false;

        //Act & Assert
        org.junit.Assert.assertFalse(tag.formatAsBlock());
    }

}