package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedNormalName_EmptyTag_ReturnsEmptyString {

    @Test
    public void normalName_EmptyTag_ReturnsEmptyString() {
        Tag tag = new Tag();
        assertEquals("", tag.normalName());
    }

}