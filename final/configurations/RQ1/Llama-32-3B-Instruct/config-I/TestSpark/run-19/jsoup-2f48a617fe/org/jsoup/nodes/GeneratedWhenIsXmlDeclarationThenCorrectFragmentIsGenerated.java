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
public class GeneratedWhenIsXmlDeclarationThenCorrectFragmentIsGenerated {

    @Mock
    private Document document;

    @Mock
    private NodeUtils nodeUtils;

    @Mock
    private XmlDeclaration xmlDeclaration;

    @Test
    public void whenIsXmlDeclarationThenCorrectFragmentIsGenerated() {
        Comment comment = new Comment("data");
        String fragment = "<data>";
        assertEquals(fragment, comment.asXmlDeclaration().fragment());
    }

}