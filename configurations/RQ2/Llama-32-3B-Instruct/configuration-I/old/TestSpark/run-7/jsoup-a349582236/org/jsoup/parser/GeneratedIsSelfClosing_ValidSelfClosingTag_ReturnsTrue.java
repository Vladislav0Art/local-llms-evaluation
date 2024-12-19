package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedIsSelfClosing_ValidSelfClosingTag_ReturnsTrue {

    @Test
    public void isSelfClosing_ValidSelfClosingTag_ReturnsTrue() {
        Tag tag = new Tag("img");
        assertTrue(tag.isSelfClosing());
    }

}