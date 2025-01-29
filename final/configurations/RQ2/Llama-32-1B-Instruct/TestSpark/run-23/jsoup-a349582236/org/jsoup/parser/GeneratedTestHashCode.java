package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestHashCode {

    private String tagName = "p";
    private Map<String, Boolean> expectedValue = new HashMap<>();

    @BeforeEach
    public void setup() {
        Mockito.reset(Parser.class);
    }

    @Test
    public void testHashCode() {
        String tag1 = "div";
        String tag2 = "p";

        int hashValue1 = Tag.valueOf(tag1, Parser.parseSettings()).hashCode();
        int hashValue2 = Tag.valueOf(tag2, Parser.parseSettings()).hashCode();

        assertEquals(hashValue1, hashValue2);
    }

}