package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestGetValuesByNamespacesCaseInsensitive {

    @Test
    public void testGetValuesByNamespacesCaseInsensitive() {
        String tagName = "p";
        Tag tag = new Tag();
        Mockito.when(tag.getName()).thenReturn(tagName);
        assertEquals(new Tag[]{new Tag(), new Tag()}, tag.getValuesByNamespaces("p"));
        Mockito.verify(tag).getValuesByNamespaces("p");
    }

}