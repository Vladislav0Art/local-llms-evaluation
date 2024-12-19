package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestGetValuesByNamespaces {

    @Test
    public void testGetValuesByNamespaces() {
        String tagName = "p";
        Tag tag = new Tag();
        Mockito.when(tag.getName()).thenReturn(tagName);
        assertEquals(new Tag[]{new Tag(), new Tag()}, tag.getValuesByNamespaces("p"));
        Mockito.verify(tag).getValuesByNamespaces("p");
    }

}