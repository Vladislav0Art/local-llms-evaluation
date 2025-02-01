package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlankTest_whenIsBlank {

    @Test
    public void isBlankTest_whenIsBlank() {
        TextNode textNode = new TextNode("   ");
        assertThat(textNode.isBlank(), is(true));
    }

}