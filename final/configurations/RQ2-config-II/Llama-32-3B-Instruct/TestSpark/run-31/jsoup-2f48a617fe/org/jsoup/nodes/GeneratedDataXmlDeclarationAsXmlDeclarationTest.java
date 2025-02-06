package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDataXmlDeclarationAsXmlDeclarationTest {

    private final Document doc = new Document();

    @Test
    public void dataXmlDeclarationAsXmlDeclarationTest() throws IOException {
        String data = "<data>Hello</data>";
        Comment comment = new Comment(data);
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertEquals(0, xmlDeclaration.getData().length());
    }
}

class Document {
    private String data;

    public void setData(String data) {
        this.data = data;
    }

    public @Nullable XmlDeclaration asXmlDeclaration() {
        return null;
    }
}

class Appendable {

}

class LeafNode {
    // Empty implementation
}

class OuterHtmlContext {
    // Empty implementation
}

class Document.

OutputSettings {
    // Empty implementation
}

class Appendable implements Appendable {
    // Empty implementation
}

interface ParseSettings {
}

}