package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.Collections;

import static org.mockito.Mockito.*;

public class GeneratedElementTagUriConstructorTest {

    @Test
    public void ElementTagUriConstructorTest() {
        Tag tagMock = mock(Tag.class);
        Element element = new Element(tagMock, "http://example.com");

        Assert.assertNotNull(element);
        Assert.assertEquals(tagMock, element.tag());
        Assert.assertEquals("http://example.com", element.baseUri());
    }

}