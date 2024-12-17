package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedNormalName_ValidTag_ReturnsLowerCasedTagName {

    @Test
    public void normalName_ValidTag_ReturnsLowerCasedTagName() {
        Tag tag = new Tag("Div");
        assertEquals("div", tag.normalName());
    }

}