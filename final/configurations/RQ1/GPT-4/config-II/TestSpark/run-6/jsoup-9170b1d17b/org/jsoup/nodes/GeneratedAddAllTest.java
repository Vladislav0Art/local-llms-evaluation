package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GeneratedAddAllTest {

    @Test
    public void addAllTest() {
        String key1 = "attribute_one";
        String key2 = "attribute_two";
        String value1 = "value_one";
        String value2 = "value_two";
        Attributes baseAttributes = new Attributes();
        Attributes addAttributes = new Attributes();
        baseAttributes.add(key1, value1);
        addAttributes.add(key2, value2);
        baseAttributes.addAll(addAttributes);
        Assert.assertEquals(value1, baseAttributes.get(key1));
        Assert.assertEquals(value2, baseAttributes.get(key2));
    }

}