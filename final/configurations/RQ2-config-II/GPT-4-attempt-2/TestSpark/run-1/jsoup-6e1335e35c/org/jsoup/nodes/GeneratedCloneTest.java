package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Element original = new Element("tag");
        Element clone = original.clone();
        Assert.assertEquals(original, clone);
    }

}