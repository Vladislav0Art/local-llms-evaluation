package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedValueOfReturnsTagForKnownTagName {

    @Test
    public void valueOfReturnsTagForKnownTagName() {
        // Arrange
        String tagName = "test";
        when(Tag.valueOf(tagName)).thenReturn(new Tag(tagName));
        when(Tag.isKnownTag(tagName)).thenReturn(true);

        // Act
        Tag result = Tag.valueOf(tagName);

        // Assert
        assertThat(result, is(new Tag(tagName)));
    }

}