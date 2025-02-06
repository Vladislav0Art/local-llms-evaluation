package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetSelfClosing_EmptyTag_ReturnsEmptyTag {

    @Test
    public void setSelfClosing_EmptyTag_ReturnsEmptyTag() {
        Tag tag = new Tag("");
        tag.setSelfClosing();
        assertTrue(tag.isSelfClosing());
    }

}