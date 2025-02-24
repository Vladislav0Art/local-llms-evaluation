package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

public class GeneratedAsXmlDeclarationTest_NoXmlDeclaration {

    @Test
    public void asXmlDeclarationTest_NoXmlDeclaration() {
        Comment comment = new Comment("test");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNull(xmlDeclaration);
    }

}