package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() throws IOException {
        TextNode textNode = new TextNode("<a>hello <span>world</span></a>");
        textNode.outerHtmlHead(Appendable.create(), 0, Document.OutputSettings.PRETTY_PRINT);
        assertEquals("<html><head><body><a>Hello <span>World</span></a></body></html>", textNode.toString());
    }

}