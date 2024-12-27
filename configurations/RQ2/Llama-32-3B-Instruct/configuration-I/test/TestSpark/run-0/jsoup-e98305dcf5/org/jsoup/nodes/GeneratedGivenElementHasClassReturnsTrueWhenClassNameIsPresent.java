package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.jsoup.select.Elements.select;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class GeneratedGivenElementHasClassReturnsTrueWhenClassNameIsPresent {

    @Test
    public void givenElementHasClassReturnsTrueWhenClassNameIsPresent() {
        when("className").thenReturn("div-class");
        Element element = new Element("className");
        assertThat(element.hasClass("class"), is(true));
    }

}