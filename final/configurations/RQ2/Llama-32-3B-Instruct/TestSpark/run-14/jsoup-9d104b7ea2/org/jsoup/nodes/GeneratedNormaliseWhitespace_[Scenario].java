package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedNormaliseWhitespace_[Scenario]{

@Test
public void normaliseWhitespace_[
Scenario](){
// Arrange & Act
String text = "   Test Node  ";
String expectedText = "Test Node";
String result = StringUtil.normaliseWhitespace(text);

// Assert
assertEquals(expectedText, result);
	}

            }