package org.jsoup.parser;

public class GeneratedTestInsertNodeWithDoctype {


    private Document document;
    private Reader reader;

    @Override
    protected void initialiseParse(Reader input, String baseUri, Parser parser) throws Exception {
        super.initialiseParse(input, baseUri, parser);

        this.reader = new StringReader("");
        this.document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(reader);
    }

    @Test
    public void testInsertNodeWithDoctype() throws Exception {
        // Arrange
        Document doctypeDeclaration = document.createElement("doctype");
        doctypeDeclaration.appendChild(document.createTextNode("<!DOCTYPE html><html>"));
        document.appendChild(doctypeDeclaration);

        Element element = (Element) treeBuilder.insertToken(document, "html");

        // Assert
        assertEquals("<!DOCTYPE html><html>", ((TreeNode) element).outerHtml());
    }

}