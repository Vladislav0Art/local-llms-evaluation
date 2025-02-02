package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;

import javax.annotation.Nullable;
import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAsXmlDeclaration_GivenXmlDeclarationData_ReturnsEmptyString {

    public static interface Appendable extends StringBuilder {
        void append(String data);
    }

    @Test
    public void asXmlDeclaration_GivenXmlDeclarationData_ReturnsEmptyString() {
        String data = "!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\"";
        Comment comment = new Comment(data);
        assertEquals("", comment.asXmlDeclaration());
    }
}

public class Document implements Appendable {

    public static interface OutputSettings {
    }

    public boolean prettyPrint() {
        return true;
    }

    @Override
    public void append(String data) {
    }

    @Override
    public String toString() {
        return "";
    }

    public Comment asXmlDeclaration() {
        return null;
    }
}

public class Element implements Appendable {

    public String tag() {
        return "tag";
    }

    public String formatAsBlock() {
        return "";
    }
}

public class Comment {

    private Document document;

    public Comment(String data) {
        this.document = new Document();
    }

    public boolean isXmlDeclaration() {
        return false;
    }

    public void append(String data) {
    }

    public Document getDocument() {
        return document;
    }

    public String getData() {
        return "";
    }

    public static Comment createComment(String data) {
        return new Comment(data);
    }

}