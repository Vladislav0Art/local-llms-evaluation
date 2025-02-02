package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class GeneratedCreateTextNode_EmptyText_returnsBlankTextNode {

    @Test
    public void createTextNode_EmptyText_returnsBlankTextNode() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertThat(textNode.text(), is(""));
    }

}