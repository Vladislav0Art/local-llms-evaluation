package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedIsEmpty_EmptyTag_ReturnsTrue {

    @Test
    public void isEmpty_EmptyTag_ReturnsTrue() {
        Tag tag = new Tag();
        assertTrue(tag.isEmpty());
    }

}