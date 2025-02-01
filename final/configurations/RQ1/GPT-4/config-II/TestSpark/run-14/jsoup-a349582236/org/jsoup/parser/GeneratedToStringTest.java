package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Tag tag = new Tag("Div");
        String expectedOutput = "Div";
        String actualOutput = tag.toString();
        Assert.assertEquals(expectedOutput, actualOutput);
    }

}