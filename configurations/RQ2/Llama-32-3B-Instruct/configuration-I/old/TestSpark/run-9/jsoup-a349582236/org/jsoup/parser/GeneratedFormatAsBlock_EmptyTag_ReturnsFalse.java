package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedFormatAsBlock_EmptyTag_ReturnsFalse {

    @Test
    public void formatAsBlock_EmptyTag_ReturnsFalse() {
        Tag tag = new Tag();
        assertFalse(tag.formatAsBlock());
    }

}