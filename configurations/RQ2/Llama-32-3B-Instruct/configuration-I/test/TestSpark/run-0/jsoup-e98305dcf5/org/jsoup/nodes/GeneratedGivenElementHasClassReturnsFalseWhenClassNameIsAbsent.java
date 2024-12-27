package org.jsoup.nodes;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.jsoup.select.Elements.select;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class GeneratedGivenElementHasClassReturnsFalseWhenClassNameIsAbsent {

    @Test
    public void givenElementHasClassReturnsFalseWhenClassNameIsAbsent() {
        when("className").thenReturn("");
        Element element = new Element("className");
        assertThat(element.hasClass("class"), is(false));
    }

}