package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedSetSelfClosing_EmptyTag_ReturnsEmptyTag {

    @Test
    public void setSelfClosing_EmptyTag_ReturnsEmptyTag() {
        Tag actual = Tag.valueOf("", null);
        Tag result = actual.setSelfClosing();
        assertEquals(actual, result);
    }

}