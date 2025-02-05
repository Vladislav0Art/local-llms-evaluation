package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.Matchers.*;

import org.junit.Assert;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Elements;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Tag;
import org.jsoup.nodes.TextNode;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInsertChildrenTest {

    @Mock
    Tag mockTag;
    @Mock
    Attributes mockAttributes;

    @Test
    public void insertChildrenTest() {
        Element parentEle = new Element("div");
        Element childEle1 = new Element("p");
        Element childEle2 = new Element("p");
        parentEle.appendChild(childEle1);
        parentEle.insertChildren(0, childEle2);
        Assert.assertEquals(childEle2, parentEle.child(0));
    }

}