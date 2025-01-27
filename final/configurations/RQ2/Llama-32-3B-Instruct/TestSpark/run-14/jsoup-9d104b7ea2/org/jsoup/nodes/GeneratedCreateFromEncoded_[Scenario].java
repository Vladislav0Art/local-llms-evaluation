package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedCreateFromEncoded_[Scenario]{

@Test
public void createFromEncoded_[
Scenario](){
// Arrange & Act
String encodedText = "Test Node";
TextNode node = TextNode.createFromEncoded(encodedText);

// Assert
assertEquals("Test Node",node.text());
        }

        }