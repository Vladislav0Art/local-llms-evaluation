package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedClone_CloneOfKnownTagName_ReturnsSameTag {

    @Test
    public void clone_CloneOfKnownTagName_ReturnsSameTag() {
        String tagName = "div";
        ParseSettings settings = new ParseSettings();
        Tag tag1 = Tag.valueOf(tagName, settings);
        Tag tag2 = (Tag) tag1.clone();
        assertEquals(tag1, tag2);
    }
}

}