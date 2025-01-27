package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedNodeName_[Scenario]{

@Test
public void nodeName_[
Scenario](){
// Arrange & Act
String text = "Test Node";
TextNode node = new TextNode(text);

// Assert
assertEquals("text",node.nodeName());
        }

        }