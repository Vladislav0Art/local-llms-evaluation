package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.assertNull;

public class GeneratedBodyReturnsNull {

    @Test
    public void bodyReturnsNull() {
        Element element = new Element();
        assertNull(element.body());
    }
}

class Comment extends org.jsoup.nodes.Element {
    public String getData() {
        return null;
    }

    public boolean isXmlDeclaration() {
        return false;
    }

    @Override
    public String nodeName() {
        return "comment";
    }

    public Comment clone() {
        return new Comment();
    }
}

class Document extends Element {
    @Override
    public Element body() {
        return null;
    }
}

class Element extends org.jsoup.nodes.Element {
}

}