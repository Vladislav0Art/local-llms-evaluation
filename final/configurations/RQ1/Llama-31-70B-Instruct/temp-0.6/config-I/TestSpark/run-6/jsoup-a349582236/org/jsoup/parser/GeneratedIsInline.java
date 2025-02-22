package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedIsInline {

    @Test
    public void isInline() {
        Tag tag = Mockito.mock(Tag.class);
        Mockito.when(tag.isInline()).thenReturn(true);
        assertTrue(tag.isInline());
    }

}