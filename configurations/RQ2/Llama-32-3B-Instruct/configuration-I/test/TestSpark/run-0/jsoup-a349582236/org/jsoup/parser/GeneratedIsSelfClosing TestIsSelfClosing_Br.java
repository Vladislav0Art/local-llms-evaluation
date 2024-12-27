package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedIsSelfClosing TestIsSelfClosing_Br {

    @Test
    public void isSelfClosing

    TestIsSelfClosing_Br() {
        String tagName = "br";
        assertTrue(Tag.isKnownTag(tagName));
        assertTrue(Tag.isSelfClosing(tagName));
    }

}