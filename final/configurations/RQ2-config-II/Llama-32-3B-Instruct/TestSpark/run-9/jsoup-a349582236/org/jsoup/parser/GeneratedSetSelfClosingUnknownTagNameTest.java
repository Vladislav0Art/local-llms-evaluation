package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetSelfClosingUnknownTagNameTest {

    @Mock
    private ParseSettings settings;

    @Test
    public void setSelfClosingUnknownTagNameTest() throws Exception {
        //Arrange
        Tag tag = new Tag();
        String tagName = "unknown";
        boolean expected = true;

        //Act & Assert
        tag.setSelfClosing();
        org.junit.Assert.assertEquals(expected, tag.isSelfClosing());
    }

}