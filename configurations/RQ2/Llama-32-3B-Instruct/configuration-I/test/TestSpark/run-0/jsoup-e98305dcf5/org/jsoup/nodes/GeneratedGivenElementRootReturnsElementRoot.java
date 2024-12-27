package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.jsoup.select.Elements.select;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class GeneratedGivenElementRootReturnsElementRoot {

    @Test
    public void givenElementRootReturnsElementRoot() {
        when("parent").thenReturn(mock(Element.class));
        Element element = new Element("parent");
        assertThat(element.root(), is(element));
    }

}