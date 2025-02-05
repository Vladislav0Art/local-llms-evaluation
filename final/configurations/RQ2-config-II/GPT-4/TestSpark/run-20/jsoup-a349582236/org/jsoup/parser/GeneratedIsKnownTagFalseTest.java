package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsKnownTagFalseTest {

    @Test
    public void isKnownTagFalseTest() {
        Assert.assertFalse(Tag.isKnownTag("newtag"));
    }

}