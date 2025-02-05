package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class GeneratedPutKeyValueBooleanTest {

    @Test
    public void putKeyValueBooleanTest() {
        Attributes attrs = new Attributes();
        attrs = attrs.put("key3", true);
        Assert.assertEquals("", attrs.get("key3"));
    }

}