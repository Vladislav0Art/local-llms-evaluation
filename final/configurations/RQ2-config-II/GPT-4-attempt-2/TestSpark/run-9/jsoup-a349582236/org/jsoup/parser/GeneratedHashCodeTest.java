package org.jsoup.parser;

import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        Tag tag = Tag.valueOf("p");
        int expected = "p".hashCode();
        Assert.assertEquals(expected, tag.hashCode());
    }

}