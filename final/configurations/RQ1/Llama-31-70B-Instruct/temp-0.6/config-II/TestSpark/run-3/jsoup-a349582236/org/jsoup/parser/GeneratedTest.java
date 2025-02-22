package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getNameShouldReturnTagName() {
        Tag tag = new Tag("p");
        String actualName = tag.getName();
        assertEquals("p", actualName);
    }

    @Test
    public void normalNameShouldReturnLowercaseTagName() {
        Tag tag = new Tag("P");
        String actualNormalName = tag.normalName();
        assertEquals("p", actualNormalName);
    }

    @Test
    public void isBlockShouldReturnFalseByDefault() {
        Tag tag = new Tag("p");
        boolean actualIsBlock = tag.isBlock();
        assertFalse(actualIsBlock);
    }

    @Test
    public void isBlockShouldReturnTrueWhenSetToTrue() {
        Tag tag = new Tag("p");
        tag.isBlock = true;
        boolean actualIsBlock = tag.isBlock();
        assertTrue(actualIsBlock);
    }

    @Test
    public void formatAsBlockShouldReturnTrueByDefault() {
        Tag tag = new Tag("p");
        boolean actualFormatAsBlock = tag.formatAsBlock();
        assertTrue(actualFormatAsBlock);
    }

    @Test
    public void formatAsBlockShouldReturnFalseWhenSetToFalse() {
        Tag tag = new Tag("p");
        tag.formatAsBlock = false;
        boolean actualFormatAsBlock = tag.formatAsBlock();
        assertFalse(actualFormatAsBlock);
    }

}