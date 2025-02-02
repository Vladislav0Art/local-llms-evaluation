package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedWhenAsXmlDeclarationAndEmptyBodyWithAttributesThenNullIsReturned {

    @Before
    public void setup() {
        // Create a new Document
        Document doc = new Document();
        doc.outputSettings().setXmlDeclaration(true);
        doc.html().append("<root><body><p>This is the first paragraph.</p></body></root>");
        doc.append("<div class=\"foo\"><a href=\"#\">Link</a> &nbsp; <span id=\"bar\" title=\"Bar, Baz, Quux!\">Span with title and value!</span></div>");
    }

    @Test
    public void whenAsXmlDeclarationAndEmptyBodyWithAttributesThenNullIsReturned() {
        Element root = doc.body();
        assertEquals(null, root.asXmlDeclaration());
    }

}