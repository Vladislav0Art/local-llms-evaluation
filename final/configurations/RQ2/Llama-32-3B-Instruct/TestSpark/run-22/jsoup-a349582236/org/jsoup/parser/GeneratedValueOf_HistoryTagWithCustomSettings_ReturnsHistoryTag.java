package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedValueOf_HistoryTagWithCustomSettings_ReturnsHistoryTag {

    @Test
    public void valueOf_HistoryTagWithCustomSettings_ReturnsHistoryTag() {
        Tag tag = Tag.valueOf("history", new ParseSettings());
        assertNotNull(tag);
        assertEquals("history", tag.getName());
    }

}