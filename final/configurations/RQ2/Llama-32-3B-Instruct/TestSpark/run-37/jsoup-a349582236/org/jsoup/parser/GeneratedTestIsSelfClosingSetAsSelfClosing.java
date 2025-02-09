package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class GeneratedTestIsSelfClosingSetAsSelfClosing {

    @Test
    public void testIsSelfClosingSetAsSelfClosing() {
        Tag tag = new Tag();
        tag.setSelfClosing(true);
        assertTrue(tag.isSelfClosing());
    }

}