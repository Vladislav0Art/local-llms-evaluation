package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlockReturnsTrueForBlockTags {

    @Test
    public void isBlockReturnsTrueForBlockTags() {
        // Arrange
        when(Tag.valueOf("test")).thenReturn(new Tag("test"));
        when(Tag.isBlock()).thenReturn(true);

        // Act
        boolean result = Tag.valueOf("test").isBlock();

        // Assert
        assertThat(result, is(true));
    }

}