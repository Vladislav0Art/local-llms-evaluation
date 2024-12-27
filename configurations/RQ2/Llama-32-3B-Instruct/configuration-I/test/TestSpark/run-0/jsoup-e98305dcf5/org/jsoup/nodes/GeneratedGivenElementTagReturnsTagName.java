package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.jsoup.select.Elements.select;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class GeneratedGivenElementTagReturnsTagName {

    @Test
    public void givenElementTagReturnsTagName() {
        when("tag").thenReturn("div");
        Element element = new Element("tag");
        assertThat(element.tagName(), is("div"));
    }

}