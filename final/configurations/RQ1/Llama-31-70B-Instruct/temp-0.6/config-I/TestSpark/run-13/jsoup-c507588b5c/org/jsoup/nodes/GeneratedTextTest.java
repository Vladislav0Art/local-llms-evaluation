package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
public class GeneratedTextTest {

    Validate .class,TextNode .class
})

public class TextNodeTest {

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("test");
        Validate.notNull(textNode);
        String actual = textNode.text();
        String expected = "test";
        Assert.assertEquals(expected, actual);
    }

}