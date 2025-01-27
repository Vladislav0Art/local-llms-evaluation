package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedLastCharIsWhitespace_[Scenario]{

@Test
public void lastCharIsWhitespace_[
Scenario](){
// Arrange & Act
StringBuilder sb = new StringBuilder(" ");
boolean result = TextNode.lastCharIsWhitespace(sb);

// Assert
assertTrue(result);
	}

            }