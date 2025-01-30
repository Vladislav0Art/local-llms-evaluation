package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCheckHasKeyDoesNotExistTest {

    @Test
    public void checkHasKeyDoesNotExistTest() {
        Attributes attributes = new Attributes();
        Assert.assertFalse(attributes.hasKey("key"));
    }

}