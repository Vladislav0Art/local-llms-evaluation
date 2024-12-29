package org.jsoup.parser;

public class GeneratedTest {

    public static final String START_TAG = "start_tag";
    public static final String CHARACTER = "character";
    public static final String COMMENT = "comment";

    public static class StartTag extends Token {
        @Override
        public String toString() {
            return START_TAG;
        }
    }

    public static class Character extends Token {
        private char character;

        public Character(char character) {
            this.character = character;
        }

        public char getCharacter() {
            return character;
        }
    }

    public static class Comment extends Token {
        @Override
        public String toString() {
            return COMMENT;
        }
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

public class XmlTreeBuilderTest {

}