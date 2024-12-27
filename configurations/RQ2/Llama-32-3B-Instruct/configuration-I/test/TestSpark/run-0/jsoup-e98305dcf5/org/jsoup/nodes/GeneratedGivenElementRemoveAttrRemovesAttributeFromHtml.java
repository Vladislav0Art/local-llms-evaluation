package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.jsoup.select.Elements.select;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class GeneratedGivenElementRemoveAttrRemovesAttributeFromHtml {

    @Test
    public void givenElementRemoveAttrRemovesAttributeFromHtml() {
        when("key").thenReturn("data-foo");
        when("value").thenReturn("bar");
        Element element = new Element("value");
        element.removeAttr("data-foo");
        assertThat(element.html(), is("<p>bar</p>"));
    }

}