package org.jsoup.parser;

public class GeneratedInsertDoctype_InsertsDoctypeIntoDocument {

    @Test
    public void insertDoctype_InsertsDoctypeIntoDocument() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.Doctype doctype = new Token.Doctype();
        Document document = new Document();
        builder.insert(doctype);
        List<XmlDeclaration> declarations = document.declarations().stream()
                .filter(declaration -> declaration instanceof XmlDeclaration).collect(Collectors.toList());
        Assert.containsExactly(declarations, new XmlDeclaration("1.0", "http://www.w3.org/TR/REC-xml/"));
    }

}