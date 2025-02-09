package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.*;
import org.junit.Assert;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedShallowCloneTest {

    @Test
    public void shallowCloneTest() {
        Document original = new Document("http://shallowclonetest.com");
        Document clone = original.shallowClone();
        Assert.assertEquals(original.toString(), clone.toString());
    }

}