package org.jsoup.nodes;

public class GeneratedCreateDocumentFromConnectionAndParserTest_ReturnsDocumentWithCorrectLocationAndCharset {

    @Test
    public void createDocumentFromConnectionAndParserTest_ReturnsDocumentWithCorrectLocationAndCharset() throws Exception {
        Connection connection = new Connection();
        Parser parser = Parser.parse("https://www.example.com", "UTF-8");
        Document document = Document.createShell(connection, parser);
        assertEquals("https://www.example.com", document.location());
        assertEquals(Charset.forName("UTF-8"), document.charset());
    }

}