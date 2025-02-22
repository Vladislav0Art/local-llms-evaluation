package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFormatAsBlockShouldReturnFalseWhenSetToFalse {

    @Test
    public void formatAsBlockShouldReturnFalseWhenSetToFalse() {
        Tag tag = new Tag("p");
        tag.formatAsBlock = false;
        boolean actualFormatAsBlock = tag.formatAsBlock();
        assertFalse(actualFormatAsBlock);
    }

}