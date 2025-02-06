package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedClone_[Scenario]{

@Test
public void clone_[
Scenario](){
TextNode originalTextNode = new TextNode("text");
TextNode clonedTextNode = originalTextNode.clone();

assertNotNull(clonedTextNode);

assertEquals(originalTextNode.text(),clonedTextNode.

text());
        }

        }