package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.jsoup.parser.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedWhenAsXmlDeclarationAndNoBodyThenNullIsReturned {

    @Mock
    private Document document;

    @Mock
    private NodeUtils nodeUtils;

    @Mock
    private XmlDeclaration xmlDeclaration;

    @Test
    public void whenAsXmlDeclarationAndNoBodyThenNullIsReturned() {
        Comment comment = new Comment("data");
        Document doc = Mockito.mock(Document.class);
        when(doc.body()).thenReturn(Mockito.mock(Element.class));
        when(doc.body().children()).thenReturn(java.util.Collections.emptyList());
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
        assertTrue(decl.isEmpty());
    }

}