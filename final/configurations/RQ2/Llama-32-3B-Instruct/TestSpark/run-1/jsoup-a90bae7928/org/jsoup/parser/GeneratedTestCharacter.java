package org.jsoup.parser;

public class GeneratedTestCharacter {

    public static final String START_TAG = "start_tag";
    public static final String CHARACTER = "character";
    public static final String COMMENT = "comment";

    public static class StartTag extends Token {
    }

    public static class Character extends Token()

    {
        private char character;

        public Character( char character){
        this.character = character;
    }

        public char getCharacter () {
        return character;
    }
    }

    public static class Comment extends Token {
    }
}

public class Element {
    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}

public class Node {
    @Override
    public boolean equals(Object obj) {
        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}

public class CharacterToken extends Token.Character {

    public CharacterToken(char character) {
        super(character);
    }
}

public class CommentToken extends Token.Comment {

    public CommentToken() {
    }
}

public class XmlTreeBuilderTest {

    @Test
    public void testCharacter() {
        CharacterToken token = new CharacterToken('a');
        assertFalse(token.getCharacter() == 'a');
    }

}