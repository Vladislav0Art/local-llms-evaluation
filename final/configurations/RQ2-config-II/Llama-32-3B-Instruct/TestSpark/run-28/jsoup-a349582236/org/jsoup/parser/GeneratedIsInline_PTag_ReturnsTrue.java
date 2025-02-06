package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsInline_PTag_ReturnsTrue {

    @Test
    public void isInline_PTag_ReturnsTrue() {
        Tag tag = new Tag();
        tag.setName("p");
        assertTrue(tag.isInline());
    }

}