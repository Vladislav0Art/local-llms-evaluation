package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestCheckNotNull {

    @Test
    public void testCheckNotNull() {
        Attributes attributes = new Attributes();
        String value = attributes.checkNotNull(null);
        Assert.assertEquals("", value);
    }

}