package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTestXmlTreeBuilderWithCharacter {

    @Test
    public void testXmlTreeBuilderWithCharacter() {
        // Given
        TreeBuilder treeBuilderMock = Mockito.mock(TreeBuilder.class);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder(treeBuilderMock);

        char character = 'a';
        Reader reader = new StringReader(String.valueOf(character));

        // When
        Document document = xmlTreeBuilder.parse(reader.toString(), "");

        // Then
        assertNotNull(document);
    }
}

public class Token {
    public enum TokenType {
        EndTag, Character
    }

    private TokenType type;
    private Object value;

    public Token(TokenType type, Object value) {
        this.type = type;
        this.value = value;
    }

    public TokenType getType() {
        return type;
    }

    public Object getValue() {
        return value;
    }
}

public class ParseSettings {
    public boolean useCdata;

    public ParseSettings(boolean useCdata) {
        this.useCdata = useCdata;
    }

    public boolean useCdata() {
        return useCdata;
    }
}

public class TreeBuilder {
    private ParseSettings settings;

    public TreeBuilder(ParseSettings settings) {
        this.settings = settings;
    }

    public ParseSettings defaultSettings() {
        return settings;
    }
}

public class XmlTreeBuilder {
    private TreeBuilder treeBuilder;

    public XmlTreeBuilder(TreeBuilder treeBuilder) {
        this.treeBuilder = treeBuilder;
    }

    public Document parse(String xml, String type) {
        // implementation
        return null;
    }

    public boolean useCdata() {
        return defaultSettings().useCdata();
    }
}

}