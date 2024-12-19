package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedIsKnownTag_ValidTagName_ReturnsTrue {

    @Test
    public void isKnownTag_ValidTagName_ReturnsTrue() {
        assertTrue(Tag.isKnownTag("div"));
    }

}