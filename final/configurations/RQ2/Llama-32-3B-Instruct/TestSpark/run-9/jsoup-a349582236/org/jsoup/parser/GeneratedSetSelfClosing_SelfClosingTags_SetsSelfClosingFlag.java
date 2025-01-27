package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetSelfClosing_SelfClosingTags_SetsSelfClosingFlag {

    @Test
    public void setSelfClosing_SelfClosingTags_SetsSelfClosingFlag() {
        String tagName = "img";
        Tag tag = Tag.valueOf(tagName);
        assertEquals(true, tag.setSelfClosing());
    }
}

class ParseSettings {
    private boolean allowComments;
    private boolean allowTags;

    public ParseSettings(boolean allowComments, boolean allowTags) {
        this.allowComments = allowComments;
        this.allowTags = allowTags;
    }

}