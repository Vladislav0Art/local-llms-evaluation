package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetSelfClosing_SettingSelfClosingReturnsFalse {

    @Test
    public void setSelfClosing_SettingSelfClosingReturnsFalse() {
        Tag tag = new Tag();
        assertFalse(tag.setSelfClosing());
    }

}