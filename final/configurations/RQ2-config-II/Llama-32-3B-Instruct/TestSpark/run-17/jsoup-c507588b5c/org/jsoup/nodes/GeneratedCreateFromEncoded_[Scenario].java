package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCreateFromEncoded_[Scenario]{

@Test
public void createFromEncoded_[
Scenario](){
String encodedText = "Hello World";
TextNode textNode = TextNode.createFromEncoded(encodedText);

assertNotNull(textNode);

assertEquals(encodedText, textNode.text());
        }

        }