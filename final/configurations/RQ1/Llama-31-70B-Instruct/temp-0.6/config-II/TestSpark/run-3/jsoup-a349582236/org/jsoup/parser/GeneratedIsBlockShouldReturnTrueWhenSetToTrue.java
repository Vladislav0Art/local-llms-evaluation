package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlockShouldReturnTrueWhenSetToTrue {

    @Test
    public void isBlockShouldReturnTrueWhenSetToTrue() {
        Tag tag = new Tag("p");
        tag.isBlock = true;
        boolean actualIsBlock = tag.isBlock();
        assertTrue(actualIsBlock);
    }

}