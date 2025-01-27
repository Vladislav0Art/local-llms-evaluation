package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetSelfClosing_H1TagReturnsFalse {

    @Test
    public void setSelfClosing_H1TagReturnsFalse() {
        Tag tag = Tag.valueOf("<h1>");
        assertFalse(tag.setSelfClosing());
    }

}