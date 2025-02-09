package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.*;
import org.junit.Assert;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Document original = new Document("http://clonetest.com");
        Document clone = original.clone();
        Assert.assertEquals(original.toString(), clone.toString());
    }

}