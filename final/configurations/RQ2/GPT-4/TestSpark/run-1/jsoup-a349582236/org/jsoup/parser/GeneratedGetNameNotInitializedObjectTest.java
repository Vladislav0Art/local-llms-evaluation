package org.jsoup.parser;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

public class GeneratedGetNameNotInitializedObjectTest {

    @Test
    public void getNameNotInitializedObjectTest() {
        Tag tag = new Tag();
        Assert.assertNull(tag.getName());
    }

}