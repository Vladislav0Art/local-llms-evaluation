package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedStripLeadingWhitespace_[Scenario]{

@Test
public void stripLeadingWhitespace_[
Scenario](){
// Arrange & Act
String text = "   Test Node  ";
String expectedText = "Test Node";
String result = StringUtil.stripLeadingWhitespace(text);

// Assert
assertEquals(expectedText, result);
	}

            }