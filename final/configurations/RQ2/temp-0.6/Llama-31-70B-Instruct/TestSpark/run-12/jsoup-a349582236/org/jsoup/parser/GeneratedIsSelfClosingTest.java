package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedIsSelfClosingTest {

    @Test
    public void isSelfClosingTest() {
        Tag tag = new Tag();
        boolean expectedSelfClosing = true;
        assertEquals(expectedSelfClosing, tag.isSelfClosing());
    }

}