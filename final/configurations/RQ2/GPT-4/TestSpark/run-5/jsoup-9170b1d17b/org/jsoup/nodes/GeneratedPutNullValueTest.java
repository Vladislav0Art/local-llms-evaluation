package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GeneratedPutNullValueTest {

    @Test
    public void putNullValueTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", null);
        Assert.assertEquals("", attributes.get("key"));
    }

}