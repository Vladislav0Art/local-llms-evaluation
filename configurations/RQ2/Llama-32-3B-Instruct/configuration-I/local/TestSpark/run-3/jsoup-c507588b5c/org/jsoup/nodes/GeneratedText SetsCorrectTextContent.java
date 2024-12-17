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
public class GeneratedText SetsCorrectTextContent {

    @Mock
    private LeafNode leafNodeMock;

    public TextNode textNode() {
        return new TextNode("test");
    }

    @Test
    public void text

    SetsCorrectTextContent() {
        String expected = "new test";
        TextNode newNode = textNode().text(expected);
        assertThat(newNode.text(), is(expected));
    }

}