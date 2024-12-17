package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedSetSelfClosing_ValidTag_ReturnsTagWithSelfClosing {

    @Test
    public void setSelfClosing_ValidTag_ReturnsTagWithSelfClosing() {
        Tag tag = new Tag("img");
        Tag result = tag.setSelfClosing();
        assertTrue(result.isSelfClosing());
    }

}