package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFormatAsBlockShouldReturnTrueByDefault {

    @Test
    public void formatAsBlockShouldReturnTrueByDefault() {
        Tag tag = new Tag("p");
        boolean actualFormatAsBlock = tag.formatAsBlock();
        assertTrue(actualFormatAsBlock);
    }

}