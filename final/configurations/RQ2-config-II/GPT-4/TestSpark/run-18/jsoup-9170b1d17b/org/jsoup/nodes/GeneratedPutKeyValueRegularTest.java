package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class GeneratedPutKeyValueRegularTest {

    @Test
    public void putKeyValueRegularTest() {
        Attributes attrs = new Attributes();
        attrs = attrs.put("key2", "value2");
        Assert.assertEquals("value2", attrs.get("key2"));
    }

}