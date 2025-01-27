package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsKnownTag_HistoryTag_ReturnsTrue {

    @Test
    public void isKnownTag_HistoryTag_ReturnsTrue() {
        Tag tag = Tag.isKnownTag("history");
        assertTrue(tag);
    }

}