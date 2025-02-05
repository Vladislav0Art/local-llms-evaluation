package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class GeneratedSizeRegularTest {

    @Test
    public void sizeRegularTest() {
        Attributes attrs = new Attributes();
        attrs.add("key1", "value1");
        attrs.add("key2", "value2");
        Assert.assertEquals(2, attrs.size());
    }

}