package org.jsoup.parser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestvalueOfTagNames {

    @Test
    public void testvalueOfTagNames() {
        assertNotSame(0, Tag.valueOf("a").hashCode());
        assertTrue(Tag.valueOf("p").equals(new Tag()));
    }

}