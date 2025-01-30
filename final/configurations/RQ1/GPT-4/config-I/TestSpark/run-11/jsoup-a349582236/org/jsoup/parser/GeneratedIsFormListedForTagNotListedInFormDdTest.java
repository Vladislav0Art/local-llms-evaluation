package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsFormListedForTagNotListedInFormDdTest {

    @Test
    public void isFormListedForTagNotListedInFormDdTest() {
        Assert.assertFalse(Tag.valueOf("dd").isFormListed());
    }

}