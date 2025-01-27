package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsSelfClosing_SelfClosingTagsAreTrue {

    @Test
    public void isSelfClosing_SelfClosingTagsAreTrue() {
        String tagName = "img";
        assertTrue(Tag.valueOf(tagName).isSelfClosing());
    }

}