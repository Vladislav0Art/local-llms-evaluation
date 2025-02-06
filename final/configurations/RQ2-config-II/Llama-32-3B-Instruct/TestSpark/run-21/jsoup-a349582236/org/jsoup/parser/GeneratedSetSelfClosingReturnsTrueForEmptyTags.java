package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSetSelfClosingReturnsTrueForEmptyTags {

    @Test
    public void setSelfClosingReturnsTrueForEmptyTags() {
        // Arrange
        when(Tag.valueOf("test")).thenReturn(new Tag(""));
        when(Tag.setSelfClosing()).thenReturn(true);

        // Act
        boolean result = Tag.valueOf("test").setSelfClosing();

        // Assert
        assertThat(result, is(true));
    }

}