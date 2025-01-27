package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalName_HistoryTag_ReturnsHistoryWithHypenatedChars {

    @Test
    public void normalName_HistoryTag_ReturnsHistoryWithHypenatedChars() {
        Tag tag = new Tag();
        tag.setName("history");
        assertEquals("history", tag.normalName());
    }

}