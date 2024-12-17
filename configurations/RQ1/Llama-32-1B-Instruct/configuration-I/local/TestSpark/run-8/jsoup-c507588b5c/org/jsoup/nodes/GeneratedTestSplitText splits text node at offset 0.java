package org.jsoup.nodes;

public class GeneratedTestSplitText splits text node at offset 0{

@Test
public void testSplitText
splits text
node at
offset 0(){
// Arrange
Document doc = new Document();
Appendable string1 = "Hello";
Document.OutputSettings out = new Document.OutputSettings();

// Act
TextNode result = TextNode.splitText(0, out);

// Assert
assertEquals("Hello",result.text());
        }

        }