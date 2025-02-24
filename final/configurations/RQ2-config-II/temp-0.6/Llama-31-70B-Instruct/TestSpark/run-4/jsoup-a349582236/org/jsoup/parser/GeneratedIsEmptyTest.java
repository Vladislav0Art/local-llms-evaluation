package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

public class GeneratedIsEmptyTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void isEmptyTest() {
        Tag tag = new Tag("div");
        Assert.assertFalse(tag.isEmpty());
    }

}