package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

public class GeneratedIsSelfClosingTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void isSelfClosingTest() {
        Tag tag = new Tag("div");
        Assert.assertFalse(tag.isSelfClosing());
    }

}