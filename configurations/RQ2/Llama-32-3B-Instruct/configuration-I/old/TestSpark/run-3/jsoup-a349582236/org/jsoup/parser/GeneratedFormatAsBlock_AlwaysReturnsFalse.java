package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFormatAsBlock_AlwaysReturnsFalse {

    @Test
    public void formatAsBlock_AlwaysReturnsFalse() {
        Tag tag = new Tag();
        assertFalse(tag.formatAsBlock());
    }

}