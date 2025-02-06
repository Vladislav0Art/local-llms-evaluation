package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedSplitText_[Scenario]{

@Test
public void splitText_[
Scenario]()throws

IOException {
    String originalText = "Hello World";
    int offset = 6;
    String expectedOutput = "Hello ";
    TextNode textNode = new TextNode(originalText);
    assertEquals(expectedOutput, textNode.splitText(offset).text());
}

}