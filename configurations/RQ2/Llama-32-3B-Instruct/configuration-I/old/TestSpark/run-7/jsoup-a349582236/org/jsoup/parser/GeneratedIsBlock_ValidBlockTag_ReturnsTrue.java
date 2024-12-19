package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedIsBlock_ValidBlockTag_ReturnsTrue {

    @Test
    public void isBlock_ValidBlockTag_ReturnsTrue() {
        Tag tag = new Tag("p");
        assertTrue(tag.isBlock());
    }

}