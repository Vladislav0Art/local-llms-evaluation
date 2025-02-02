package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIsXmlDeclarationReturnsTrueWhenStartsWithExclamationMark {

    @Test
    public void isXmlDeclarationReturnsTrueWhenStartsWithExclamationMark() {
        String data = "!xml declaration";
        assertTrue(comment.isXmlDeclaration(data));
    }

}