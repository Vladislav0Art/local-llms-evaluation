package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class GeneratedNormalNameTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void normalNameTest() {
        Tag tag = new Tag("DIV");
        Assert.assertEquals("div", tag.normalName());
    }

}