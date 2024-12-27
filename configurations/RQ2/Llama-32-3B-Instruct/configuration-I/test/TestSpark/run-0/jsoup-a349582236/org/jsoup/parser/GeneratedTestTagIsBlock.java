package org.jsoup.parser;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.hamcrest.Description;
import org.jsoup.parser.Tag;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class GeneratedTestTagIsBlock {

    @Test
    public void testTagIsBlock() {
        String tag = "<div>text</div>";
        Description description = new Description();
        assertThat(tag, is(is("div").value()));
        description.appendText(" is a block element");
        assertThat(description, is(true));
    }

}