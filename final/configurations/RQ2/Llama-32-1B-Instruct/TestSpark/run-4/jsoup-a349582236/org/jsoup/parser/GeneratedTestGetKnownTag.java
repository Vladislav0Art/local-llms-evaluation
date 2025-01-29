package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestGetKnownTag {

    @Test
    public void testGetKnownTag() {
        String tagName = "div";
        ParseSettings settings = Mockito.mock(ParseSettings.class);
        Tag tag = new Tag();
        Mockito.when(settings.getKnownTags()).thenReturn(new java.util.ArrayList<>(Collections.singletonList(tagName)));
        assertEquals(tagName, tag.getKnownTag());
    }

}