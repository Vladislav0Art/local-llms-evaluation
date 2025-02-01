package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedLastCharIsWhitespace_whenIsSpace {

    @Test
    public void lastCharIsWhitespace_whenIsSpace() {
        boolean result = TextNode.lastCharIsWhitespace(new StringBuilder("test "));
        assertThat(result, is(true));
    }

}