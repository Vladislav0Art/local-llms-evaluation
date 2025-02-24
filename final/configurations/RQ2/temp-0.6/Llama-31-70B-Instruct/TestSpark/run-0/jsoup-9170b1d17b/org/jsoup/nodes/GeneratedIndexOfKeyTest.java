package org.jsoup.nodes;

import static org.jsoup.internal.Normalizer.lowerCase;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.ParseSettings;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedIndexOfKeyTest {

    @Test
    public void indexOfKeyTest() {
        Attributes attributes = new Attributes();
        int actualValue = attributes.indexOfKey("key");
        Assert.assertEquals(0, actualValue);
    }

}