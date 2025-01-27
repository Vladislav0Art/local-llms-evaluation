package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetSelfClosing_H1TagReturnsfalse {

    @Test
    public void setSelfClosing_H1TagReturnsfalse() {
        Tag tag = new Tag();
        boolean result = tag.setSelfClosing();
        assertFalse(result);
    }

}