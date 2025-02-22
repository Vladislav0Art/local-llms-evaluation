package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedIsEmpty {

    @Test
    public void isEmpty() {
        Tag tag = Mockito.mock(Tag.class);
        Mockito.when(tag.isEmpty()).thenReturn(false);
        assertFalse(tag.isEmpty());
    }

}