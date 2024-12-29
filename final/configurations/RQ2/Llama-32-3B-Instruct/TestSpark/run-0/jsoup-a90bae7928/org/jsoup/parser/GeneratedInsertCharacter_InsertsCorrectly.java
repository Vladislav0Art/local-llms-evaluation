package org.jsoup.parser;

public class GeneratedInsertCharacter_InsertsCorrectly {

    @Test
    public void insertCharacter_InsertsCorrectly() {
        Token.Character character = new Token.Character('!');
        new XmlTreeBuilder().insert(character);
        assertNotNull(new XmlTreeBuilder().getDocument());
    }

}