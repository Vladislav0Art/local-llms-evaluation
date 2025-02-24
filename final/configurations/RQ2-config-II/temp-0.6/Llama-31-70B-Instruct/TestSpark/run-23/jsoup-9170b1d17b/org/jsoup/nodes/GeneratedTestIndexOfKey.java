package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestIndexOfKey {

    @Test
    public void testIndexOfKey() {
        Attributes attributes = new Attributes();
        int index = attributes.indexOfKey("key");
        Assert.assertEquals(0, index);
    }

}