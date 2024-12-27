package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedIsBlock TestIsBlock_Div {

    @Test
    public void isBlock

    TestIsBlock_Div() {
        String tagName = "div";
        assertTrue(Tag.isKnownTag(tagName));
        assertTrue(Tag.isBlock(tagName));
    }

}