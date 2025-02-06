package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsSelfClosing_ValidTag_ReturnsTrue {

    @Test
    public void isSelfClosing_ValidTag_ReturnsTrue() {
        String name = "img";
        Tag tag = new Tag(name);
        assertTrue(tag.isSelfClosing());
    }

}