package org.jsoup.parser;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestIsFormListed {

    @Test
    public void testIsFormListed() {
        Tag tag = new Tag();
        when(tag.isFormListed()).thenReturn(false);
        assertFalse(tag.isFormListed());
    }

}