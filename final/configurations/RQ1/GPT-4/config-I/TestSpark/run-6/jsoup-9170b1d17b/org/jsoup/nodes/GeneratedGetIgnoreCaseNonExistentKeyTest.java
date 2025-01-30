package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;

public class GeneratedGetIgnoreCaseNonExistentKeyTest {

    @Test
    public void getIgnoreCaseNonExistentKeyTest() {
        Attributes attrs = new Attributes();
        Assert.assertEquals("", attrs.getIgnoreCase("KEY"));
    }

}