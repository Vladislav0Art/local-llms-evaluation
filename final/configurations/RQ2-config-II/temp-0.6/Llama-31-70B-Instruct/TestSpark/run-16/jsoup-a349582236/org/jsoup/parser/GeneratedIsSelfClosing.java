package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsSelfClosing {

    @Test
    public void isSelfClosing() {
        Tag tag = new Tag("test");
        assertFalse(tag.isSelfClosing());
    }

}