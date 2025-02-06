package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValueOfReturnsNullForUnknownTagName {

    @Test
    public void valueOfReturnsNullForUnknownTagName() {
        // Arrange
        String tagName = "test";
        when(Tag.isKnownTag(tagName)).thenReturn(false);

        // Act
        Tag result = Tag.valueOf(tagName);

        // Assert
        assertThat(result, is(null));
    }

}