package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedValueOfPreservCaseEmptyTagTest {

    @Test
    public void valueOfPreservCaseEmptyTagTest() {
        try {
            Tag.valueOf("");
            Assert.fail("Should have thrown an Exception");
        } catch (IllegalArgumentException e) {
            // Test passed
        }
    }

}