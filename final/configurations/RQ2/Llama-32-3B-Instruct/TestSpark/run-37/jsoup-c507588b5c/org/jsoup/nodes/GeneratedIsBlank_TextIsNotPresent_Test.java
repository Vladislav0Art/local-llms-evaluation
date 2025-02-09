package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.jsoup.helper.Validate.notEmpty;
import static org.jsoup.nodes.TextNode.clone;
import static org.jsoup.nodes.TextNode.createFromEncoded;
import static org.jsoup.nodes.TextNode.splitText;
import static org.jsoup.nodes.NodeType.TEXT;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlank_TextIsNotPresent_Test {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    public TextNode createTextNode() {
        return new TextNode("");
    }

    @Test
    public void isBlank_TextIsNotPresent_Test() {
        createTextNode();
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertThat(node.isBlank(), is(false));
    }

}