package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedNewCommentIsXmlDeclarationFalse {

    @Test
    public void newCommentIsXmlDeclarationFalse() {
        Comment comment = new Comment("Hello, World!");
        assertFalse(comment.isXmlDeclaration());
    }

}