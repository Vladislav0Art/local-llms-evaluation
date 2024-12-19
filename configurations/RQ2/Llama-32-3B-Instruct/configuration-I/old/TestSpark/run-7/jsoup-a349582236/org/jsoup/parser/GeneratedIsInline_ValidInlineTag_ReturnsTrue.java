package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedIsInline_ValidInlineTag_ReturnsTrue {

    @Test
    public void isInline_ValidInlineTag_ReturnsTrue() {
        Tag tag = new Tag("span");
        assertTrue(tag.isInline());
    }

}