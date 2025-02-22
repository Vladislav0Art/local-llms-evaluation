package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class GeneratedTestNormalName {

    @Test
    public void testNormalName() {
        Tag tag = new Tag("Test");
        assertEquals("test", tag.normalName());
    }

}