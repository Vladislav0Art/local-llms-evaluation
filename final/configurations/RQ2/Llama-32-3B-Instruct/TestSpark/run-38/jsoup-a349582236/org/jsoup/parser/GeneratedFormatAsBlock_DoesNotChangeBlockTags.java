package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedFormatAsBlock_DoesNotChangeBlockTags {

    @Test
    public void formatAsBlock_DoesNotChangeBlockTags() {
        assertTrue(Tag.class.isAssignableFrom(EmptyTag.class));
        EmptyTag emptyTag = (EmptyTag) Tag.valueOf("");
        assertFalse(emptyTag.formatAsBlock());
        assertFalse(Tag.valueOf("img").formatAsBlock());
    }

}