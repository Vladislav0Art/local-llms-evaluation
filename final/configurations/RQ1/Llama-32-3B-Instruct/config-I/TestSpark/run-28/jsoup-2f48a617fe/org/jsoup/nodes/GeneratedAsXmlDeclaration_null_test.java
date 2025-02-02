package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedAsXmlDeclaration_null_test {

    @Test
    public void asXmlDeclaration_null_test() {
        String data = "some data";
        Comment comment = new Comment(data);
        assertNull(comment.asXmlDeclaration());
    }
}

class Appendable extends java.util.List<java.lang.String> {
    public Appendable append(String str) {
        add(str);
        return this;
    }

    @Override
    public int size() {
        return super.size();
    }

}