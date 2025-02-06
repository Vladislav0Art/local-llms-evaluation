package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

@RunWith(JUnit4.class)
public class GeneratedSetSelfClosing_BlockTag_ReturnsFalse {

    @Test
    public void setSelfClosing_BlockTag_ReturnsFalse() {
        stringName = "div";
        Tag tag = Tag.valueOf(stringName);
        assertFalse(tag.setSelfClosing());
    }

}