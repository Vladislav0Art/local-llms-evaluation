package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

@RunWith(JUnit4.class)
public class GeneratedSetSelfClosing_SelfClosingTag_ReturnsTrue {

    @Test
    public void setSelfClosing_SelfClosingTag_ReturnsTrue() {
        String name = "img";
        Tag tag = Tag.valueOf(name);
        assertTrue(tag.setSelfClosing());
    }

}