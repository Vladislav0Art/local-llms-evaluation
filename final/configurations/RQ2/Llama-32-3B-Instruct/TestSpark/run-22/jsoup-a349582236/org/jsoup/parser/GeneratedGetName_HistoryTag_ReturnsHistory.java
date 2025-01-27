package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedGetName_HistoryTag_ReturnsHistory {

    @Test
    public void getName_HistoryTag_ReturnsHistory() {
        Tag tag = new Tag();
        tag.setName("history");
        assertEquals("history", tag.getName());
    }

}