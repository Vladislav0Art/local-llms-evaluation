package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsSelfClosing_SelfClosingTags_ReturnsTrue {

    @Test
    public void isSelfClosing_SelfClosingTags_ReturnsTrue() {
        Tag tag = new Tag("img");
        assertTrue(tag.isSelfClosing());
    }

}