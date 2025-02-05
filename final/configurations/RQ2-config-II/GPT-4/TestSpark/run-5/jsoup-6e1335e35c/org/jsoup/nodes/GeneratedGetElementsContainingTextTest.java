package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedGetElementsContainingTextTest {

    @Test
    public void getElementsContainingTextTest() {
        Element mockElement = mock(Element.class);
        when(mockElement.text()).thenReturn("Hello World");
        Element parentElement = new Element(Tag.valueOf("div"), "");
        parentElement.appendChild(mockElement);
        Elements elements = parentElement.getElementsContainingText("Hello");
        Assert.assertEquals(1, elements.size());
        Assert.assertEquals("Hello World", elements.get(0).text());
    }

}