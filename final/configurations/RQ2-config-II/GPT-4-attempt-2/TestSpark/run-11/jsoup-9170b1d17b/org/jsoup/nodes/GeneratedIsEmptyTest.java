package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedIsEmptyTest {

    @Test
    public void isEmptyTest() {
        Attributes attrs = new Attributes();
        Assert.assertTrue(attrs.isEmpty());
    }

}