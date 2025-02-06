package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

@RunWith(JUnit4.class)
public class GeneratedIsSelfClosing_SelfClosingTag_ReturnsTrue {

    @Test
    public void isSelfClosing_SelfClosingTag_ReturnsTrue() {
        Tag tag = Tag.valueOf("img");
        assertTrue(tag.isSelfClosing());
    }

}