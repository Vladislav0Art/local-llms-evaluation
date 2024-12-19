package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

public class GeneratedSplitText_GivenBlankTextNode_SplitsCorrectly {

    @Test
    public void splitText_GivenBlankTextNode_SplitsCorrectly() {
        TextNode textNode = new TextNode("");
        TextNode tailNode = textNode.splitText(0);
        assertTrue(tailNode.isBlank());
    }
}

}