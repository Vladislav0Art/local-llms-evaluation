package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsXmlDeclaration_returnsFalse {

    @Test
    public void isXmlDeclaration_returnsFalse() {
        Comment comment = new Comment("data");
        AssertFalse(comment.isXmlDeclaration());
    }

}