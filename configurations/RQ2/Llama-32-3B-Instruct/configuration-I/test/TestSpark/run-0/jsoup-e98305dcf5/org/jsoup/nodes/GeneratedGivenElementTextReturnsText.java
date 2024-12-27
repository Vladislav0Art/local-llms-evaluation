package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.jsoup.select.Elements.select;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class GeneratedGivenElementTextReturnsText {

    @Test
    public void givenElementTextReturnsText() {
        when("text").thenReturn("Hello World");
        Element element = new Element("text");
        assertThat(element.text(), is("Hello World"));
    }

}