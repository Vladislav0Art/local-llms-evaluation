package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private ParseSettings parseSettings;

    @Test
    public void testClone() {
        Tag tag = new Tag("div");
        tag.isBlock = true;
        tag.preserveWhitespace = true;
        tag.formatAsBlock = true;
        tag.empty = true;
        tag.selfClosing = true;
        tag.formList = true;
        tag.formSubmit = true;

        Tag clone = tag.clone();

        Assert.assertNotSame(tag, clone);
        Assert.assertEquals(tag.isBlock, clone.isBlock);
        Assert.assertEquals(tag.preserveWhitespace, clone.preserveWhitespace);
        Assert.assertEquals(tag.formatAsBlock, clone.formatAsBlock);
        Assert.assertEquals(tag.empty, clone.empty);
        Assert.assertEquals(tag.selfClosing, clone.selfClosing);
        Assert.assertEquals(tag.formList, clone.formList);
        Assert.assertEquals(tag.formSubmit, clone.formSubmit);
    }

}