package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedIsSelfClosing {

    @Test
    public void isSelfClosing() {
        Tag tag = Mockito.mock(Tag.class);
        Mockito.when(tag.isSelfClosing()).thenReturn(true);
        assertTrue(tag.isSelfClosing());
    }

}