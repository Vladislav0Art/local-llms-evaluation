package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetSelfClosing_SelfClosingTag_ReturnsSelfClosingTag {

    @Test
    public void setSelfClosing_SelfClosingTag_ReturnsSelfClosingTag() {
        Tag tag = new Tag("img");
        Tag selfClosingTag = tag.setSelfClosing();
        assertTrue(selfClosingTag.isSelfClosing());
    }

}