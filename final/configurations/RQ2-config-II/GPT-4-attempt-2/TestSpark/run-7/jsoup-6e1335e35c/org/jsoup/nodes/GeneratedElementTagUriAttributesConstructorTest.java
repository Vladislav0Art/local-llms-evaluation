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

public class GeneratedElementTagUriAttributesConstructorTest {

    @Test
    public void ElementTagUriAttributesConstructorTest() {
        Tag tagMock = mock(Tag.class);
        Attributes attributesMock = mock(Attributes.class);
        Element element = new Element(tagMock, "http://example.com", attributesMock);

        Assert.assertNotNull(element);
        Assert.assertEquals(tagMock, element.tag());
        Assert.assertEquals("http://example.com", element.baseUri());
        Assert.assertEquals(attributesMock, element.attributes());
    }

}