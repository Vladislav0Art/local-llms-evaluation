package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedToStringValidInputTest {

    @Test
    public void toStringValidInputTest() {
        Tag tag = Tag.valueOf("tag_name");
        assertEquals("<tag_name>", tag.toString());
    }

}