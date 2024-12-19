package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestGetValues {

    @Test
    public void testGetValues() {
        String tagName = "p";
        Tag tag = new Tag();
        Mockito.when(tag.getName()).thenReturn(tagName);
        assertEquals(new Tag[]{new Tag(), new Tag()}, tag.getValues());
        Mockito.verify(tag).getValues();
    }
}

}