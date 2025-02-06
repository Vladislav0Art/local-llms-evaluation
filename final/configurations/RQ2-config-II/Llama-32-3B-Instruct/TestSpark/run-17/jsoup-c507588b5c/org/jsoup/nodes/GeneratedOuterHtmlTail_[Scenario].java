package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlTail_[Scenario]{

@Test
public void outerHtmlTail_[
Scenario](){
StringBuilder expectedOutput = "</p>";
Appendable accum = new StringBuilder();
int depth = 0;
Document.OutputSettings out = null;
TextNode textNode = new TextNode("Hello World");
		textNode.

outerHtmlTail(accum, depth, out);

assertEquals(expectedOutput.toString(),accum.

toString());
        }

        }