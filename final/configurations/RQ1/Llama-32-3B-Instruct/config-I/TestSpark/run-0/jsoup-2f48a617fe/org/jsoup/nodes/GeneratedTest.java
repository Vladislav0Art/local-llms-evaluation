package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testComment() {
        Document document = Jsoup.parse("<!DOCTYPE html><html><body></body></html>");
        String xmlDeclaration = "<!DOCTYPE html>";
        Element commentElement = document.createElement("comment");
        commentElement.appendText(xmlDeclaration);
        Comment comment = new Comment(commentElement, document);
        assertTrue(comment.isXmlDeclaration());
        assertNull(comment.asXmlDeclaration());
    }
}

@Test
public void testGeneratedComment() {
    Document document = Jsoup.parse("<!DOCTYPE html><html><body></body></html>");
    String xmlDeclaration = "<!DOCTYPE html>";
    Element parentNode = new Element("parent", "tag");
    Comment comment = new Comment(parentNode, document);
    assertEquals(xmlDeclaration, comment.nodeName());
}
	}

@Test
public void testGeneratedComment2() {
    Document document = Jsoup.parse("<!DOCTYPE html><html><body></body></html>");
    String xmlDeclaration = "<!DOCTYPE html>";
    Element parentNode = new Element("parent", "tag");
    Comment comment = new Comment(parentNode, document);
    assertTrue(comment.asXmlDeclaration().equals(xmlDeclaration));
}
	}

@Test
public void testGeneratedComment3() {
    Document document = Jsoup.parse("<!DOCTYPE html><html><body></body></html>");
    String xmlDeclaration = "<!DOCTYPE html>";
    Element parentNode = new Element("parent", "tag");
    Comment comment = new Comment(parentNode, document);
    assertEquals(comment.getData(), xmlDeclaration);
}
	}

@Test
public void testGeneratedComment4() {
    Document document = Jsoup.parse("<!DOCTYPE html><html><body></body></html>");
    String xmlDeclaration = "<!DOCTYPE html>";
    Element parentNode = new Element("parent", "tag");
    Comment comment = new Comment(parentNode, document);
    assertFalse(comment.isXmlDeclaration());
}

}