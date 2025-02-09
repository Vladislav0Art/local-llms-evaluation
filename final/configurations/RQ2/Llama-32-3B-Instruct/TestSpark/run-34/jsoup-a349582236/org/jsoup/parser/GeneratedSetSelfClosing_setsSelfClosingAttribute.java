package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetSelfClosing_setsSelfClosingAttribute {

    @Test
    public void setSelfClosing_setsSelfClosingAttribute() {
        Tag actualTag = new Tag();
        Tag modifiedTag = actualTag.setSelfClosing();
        assertTrue(modifiedTag.isSelfClosing());
    }

}