package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class GeneratedCloneTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void cloneTest() {
        Tag tag1 = new Tag("div");
        Tag tag2 = tag1.clone();
        Assert.assertEquals(tag1, tag2);
    }

}