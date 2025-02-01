package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPredictParseBehaviourNoCaseTest {

    @Test
    public void predictParseBehaviourNoCaseTest() {
        assertEquals(Tag.valueOf("body"), Tag.valueOf("BODY", ParseSettings.noCase));
        assertFalse(Tag.valueOf("BODY", ParseSettings.noCase).isBlock());
    }

}