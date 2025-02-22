package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlockShouldReturnFalseByDefault {

    @Test
    public void isBlockShouldReturnFalseByDefault() {
        Tag tag = new Tag("p");
        boolean actualIsBlock = tag.isBlock();
        assertFalse(actualIsBlock);
    }

}