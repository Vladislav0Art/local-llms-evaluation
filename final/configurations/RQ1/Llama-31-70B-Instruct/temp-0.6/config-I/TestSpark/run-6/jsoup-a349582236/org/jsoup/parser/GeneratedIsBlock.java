package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedIsBlock {

    @Test
    public void isBlock() {
        Tag tag = Mockito.mock(Tag.class);
        Mockito.when(tag.isBlock()).thenReturn(true);
        assertTrue(tag.isBlock());
    }

}