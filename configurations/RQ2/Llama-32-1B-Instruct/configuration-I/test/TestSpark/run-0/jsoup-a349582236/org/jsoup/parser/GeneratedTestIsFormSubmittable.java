package org.jsoup.parser;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestIsFormSubmittable {

    @Test
    public void testIsFormSubmittable() {
        Tag tag = new Tag();
        when(tag.isFormSubmittable()).thenReturn(true);
        assertTrue(tag.isFormSubmittable());
    }

}