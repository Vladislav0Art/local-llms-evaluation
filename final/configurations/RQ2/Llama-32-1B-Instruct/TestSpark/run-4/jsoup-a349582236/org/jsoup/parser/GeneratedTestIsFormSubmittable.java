package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestIsFormSubmittable {

    @Test
    public void testIsFormSubmittable() {
        String tagName = "form";
        ParseSettings settings = Mockito.mock(ParseSettings.class);
        Tag tag = new Tag();
        Mockito.when(settings.getForms()).thenReturn(new java.util.ArrayList<>());
        assertTrue(tag.isFormSubmittable());
    }

}