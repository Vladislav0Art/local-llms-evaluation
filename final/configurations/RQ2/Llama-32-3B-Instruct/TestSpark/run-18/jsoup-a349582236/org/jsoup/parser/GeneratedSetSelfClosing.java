package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

import java.util.HashMap;
import java.util.Map;

public class GeneratedSetSelfClosing {

    @Test
    public void setSelfClosing() {
        Tag tag = new Tag();
        tag.setSelfClosing();
        assertEquals(true, tag.isSelfClosing());
    }
}

class ParseSettings {
}

class CloneableTag extends Tag implements Cloneable {
    @Override
    protected Tag clone() { /* implementation */
    }

}