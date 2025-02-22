package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedPreserveWhitespace {

    @Test
    public void preserveWhitespace() {
        Tag tag = Mockito.mock(Tag.class);
        Mockito.when(tag.preserveWhitespace()).thenReturn(true);
        assertTrue(tag.preserveWhitespace());
    }

}