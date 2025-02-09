package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

public class GeneratedTestSetSelfClosingFalse {

    @Test
    public void testSetSelfClosingFalse() {
        Tag tag = new Tag();
        tag.setSelfClosing(false);
        assertFalse(tag.isSelfClosing());
    }

}