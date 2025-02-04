package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsXmlDeclaration_test2 {

    @Test
    public void isXmlDeclaration_test2() {
        Comment comment = new Comment("  ");
        assertFalse(comment.isXmlDeclaration());
    }
}

class Appendable extends java.io.PrintWriter {

    private static final long serialVersionUID = 1L;

    public void append(String str) throws IOException {
        super.print(str);
    }

    public void append(char c) throws IOException {
        super.print(c);
    }
}

class Element {
    private String tag;

    public String tagName() {
        return tag;
    }

    protected void setTag(String tag) {
        this.tag = tag;
    }

}