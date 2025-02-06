package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsSelfClosingTrueTest {

    @Mock
    private ParseSettings settings;

    @Test
    public void isSelfClosingTrueTest() {
        //Arrange
        Tag tag = new Tag();

        //Act & Assert
        org.junit.Assert.assertTrue(tag.isSelfClosing());
    }

}