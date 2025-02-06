package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlHead_[Scenario]{

@Test
public void outerHtmlHead_[
Scenario]()throws

IOException {
    StringBuilder expectedOutput = "<p>Hello World</p>";
    Appendable accum = new StringBuilder();
    int depth = 0;
    Document.OutputSettings out = null;
    TextNode textNode = new TextNode("Hello World");
    textNode.outerHtmlHead(accum, depth, out);
    assertEquals(expectedOutput.toString(), accum.toString());
}

}