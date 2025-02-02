package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class GeneratedSplitText_SplitsTextAtOffset_CreatesNewTextNode {

    @Test
    public void splitText_SplitsTextAtOffset_CreatesNewTextNode() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        TextNode tailNode = textNode.splitText(6);
        assertThat(tailNode.text(), is("World"));
    }

}