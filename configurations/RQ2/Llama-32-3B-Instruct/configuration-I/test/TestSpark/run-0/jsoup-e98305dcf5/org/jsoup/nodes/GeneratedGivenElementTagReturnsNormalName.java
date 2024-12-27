package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.jsoup.select.Elements.select;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class GeneratedGivenElementTagReturnsNormalName {

    @Test
    public void givenElementTagReturnsNormalName() {
        when("tag").thenReturn("div");
        Element element = new Element("tag");
        assertThat(element.normalName(), is("div"));
    }

}