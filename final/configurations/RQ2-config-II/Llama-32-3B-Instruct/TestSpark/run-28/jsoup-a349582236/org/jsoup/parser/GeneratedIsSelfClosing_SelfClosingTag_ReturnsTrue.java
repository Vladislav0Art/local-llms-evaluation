package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsSelfClosing_SelfClosingTag_ReturnsTrue {

    @Test
    public void isSelfClosing_SelfClosingTag_ReturnsTrue() {
        Tag tag = new Tag();
        tag.setName("img");
        assertTrue(tag.isSelfClosing());
    }

}