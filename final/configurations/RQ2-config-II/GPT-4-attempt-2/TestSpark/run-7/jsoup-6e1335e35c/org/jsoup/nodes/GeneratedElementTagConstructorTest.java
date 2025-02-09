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

public class GeneratedElementTagConstructorTest {

    @Test
    public void ElementTagConstructorTest() {
        Tag tagMock = mock(Tag.class);
        Element element = new Element(tagMock);

        Assert.assertNotNull(element);
        Assert.assertEquals(tagMock, element.tag());
    }

}