package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedSetSelfClosing TestSetSelfClosing_Br {

    @Test
    public void setSelfClosing

    TestSetSelfClosing_Br() {
        String tagName = "br";
        Tag tag = new Tag(tagName);
        tag.setSelfClosing();
        assertTrue(tag.isSelfClosing(tagName));
    }

}