package org.jsoup.nodes;

public class GeneratedClone_SucceedsWhenCloneIsNot-null{

@Test
public void clone_SucceedsWhenCloneIsNot-null(){
TextNode node = new TextNode("Hello, World!");
TextNode clone = node.clone();

assertNotNull(clone);

assertEquals(node.text(),clone.

text());
        }

        }