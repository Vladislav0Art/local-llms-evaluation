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
public class GeneratedClassNamesTest {

    @Mock
    Tag mockTag;
    @Mock
    Attributes mockAttributes;

    @Test
    public void classNamesTest() {
        Element currentEle = new Element("div");
        currentEle.attr("class", "header");
        Assert.assertThat(currentEle.classNames(), hasItem("header"));
    }

}