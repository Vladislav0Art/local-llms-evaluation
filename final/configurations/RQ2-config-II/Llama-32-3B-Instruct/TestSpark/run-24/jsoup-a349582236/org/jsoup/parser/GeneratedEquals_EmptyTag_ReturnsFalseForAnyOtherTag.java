package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedEquals_EmptyTag_ReturnsFalseForAnyOtherTag {

    @Test
    public void equals_EmptyTag_ReturnsFalseForAnyOtherTag() {
        Tag tag1 = new Tag("");
        Tag tag2 = new Tag("");
        assertFalse(tag1.equals(tag2));
    }
}

}