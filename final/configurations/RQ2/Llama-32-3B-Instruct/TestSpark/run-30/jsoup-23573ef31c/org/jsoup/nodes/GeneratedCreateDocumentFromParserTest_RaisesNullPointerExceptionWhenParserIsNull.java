package org.jsoup.nodes;

public class GeneratedCreateDocumentFromParserTest_RaisesNullPointerExceptionWhenParserIsNull {

    @Test
    public void createDocumentFromParserTest_RaisesNullPointerExceptionWhenParserIsNull() {
        Parser parser = null;
        assertThrows(NullPointerException.class, () -> new Document(parser));
    }

}