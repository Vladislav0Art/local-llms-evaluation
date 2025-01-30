package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedValueOfNonExistentTagNameWithPreserveCaseSettingsTest {

    @Test
    public void valueOfNonExistentTagNameWithPreserveCaseSettingsTest() {
        Tag tag = Tag.valueOf("nonexistenttag", ParseSettings.preserveCase);
        Assert.assertEquals("nonexistenttag", tag.getName());
        Assert.assertFalse(tag.isBlock());
    }

}