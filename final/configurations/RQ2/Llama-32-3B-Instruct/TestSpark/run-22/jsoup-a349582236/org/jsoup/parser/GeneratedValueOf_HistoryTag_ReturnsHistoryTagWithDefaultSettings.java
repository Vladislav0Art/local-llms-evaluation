package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedValueOf_HistoryTag_ReturnsHistoryTagWithDefaultSettings {

    @Test
    public void valueOf_HistoryTag_ReturnsHistoryTagWithDefaultSettings() {
        Tag tag = Tag.valueOf("history", new ParseSettings());
        assertNotNull(tag);
        assertEquals("history", tag.getName());
    }

}