package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestGetValuesByNamespacesCaseSensitive {

    @Test
    public void testGetValuesByNamespacesCaseSensitive() {
        String tagName = "P";
        Tag tag = new Tag();
        Mockito.when(tag.getName()).thenReturn(tagName);
        assertEquals(new Tag[]{new Tag(), new Tag()}, tag.getValuesByNamespaces("P"));
        Mockito.verify(tag).getValuesByNamespaces("P");
    }

}