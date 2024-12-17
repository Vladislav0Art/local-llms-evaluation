package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedIsKnownTag_EmptyString_ReturnsFalse {

    @Test
    public void isKnownTag_EmptyString_ReturnsFalse() {
        assertFalse(Tag.isKnownTag(""));
    }

}