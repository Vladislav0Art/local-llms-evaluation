package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

public class GeneratedNormalNameTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void normalNameTest() {
        Tag tag = new Tag("div");
        Assert.assertEquals("div", tag.normalName());
    }

}