package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSplitText_SplitsTextCorrectly {

    public TextNode textNode() {
        return new TextNode("test");
    }

    @Test
    public void splitText_SplitsTextCorrectly() {
        int offset = 5;
        String expected = "test";
        TextNode newTextNode = textNode().splitText(offset);
        when(newTextNode.getWholeText()).thenReturn(expected);

        assertThat(textNode().splitText(offset).getWholeText(), is(expected));
    }

}