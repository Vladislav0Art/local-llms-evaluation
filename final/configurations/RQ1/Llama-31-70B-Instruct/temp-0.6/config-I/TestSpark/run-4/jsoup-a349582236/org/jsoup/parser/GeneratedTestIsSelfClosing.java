package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class GeneratedTestIsSelfClosing {

    @Test
    public void testIsSelfClosing() {
        Tag tag = new Tag("img");
        assertTrue(tag.isSelfClosing());
    }

}