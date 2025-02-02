package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;

public class GeneratedIsXmlDeclarationReturnsFalseForCorrectData {

    @Test
    public void isXmlDeclarationReturnsFalseForCorrectData() {
        assertTrue(Comment.isXmlDeclaration().booleanValue());
    }
}

public class Comment {

    private String data;

    public Comment(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

}