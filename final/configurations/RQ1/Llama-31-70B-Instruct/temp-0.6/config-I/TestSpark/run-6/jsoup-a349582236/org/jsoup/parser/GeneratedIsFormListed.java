package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedIsFormListed {

    @Test
    public void isFormListed() {
        Tag tag = Mockito.mock(Tag.class);
        Mockito.when(tag.isFormListed()).thenReturn(true);
        assertTrue(tag.isFormListed());
    }

}