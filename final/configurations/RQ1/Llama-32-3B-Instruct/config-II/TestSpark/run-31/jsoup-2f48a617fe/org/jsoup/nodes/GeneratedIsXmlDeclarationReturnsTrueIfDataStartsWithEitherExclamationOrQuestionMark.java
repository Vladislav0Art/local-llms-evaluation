package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayInputStream;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.nodes.NodeUtils;
import org.jsoup.nodes.Appendable;

public class GeneratedIsXmlDeclarationReturnsTrueIfDataStartsWithEitherExclamationOrQuestionMark {

    @Test
    public void isXmlDeclarationReturnsTrueIfDataStartsWithEitherExclamationOrQuestionMark() {
        Comment comment = new Comment("!");
        assertTrue(comment.isXmlDeclaration());
        assertFalse(comment.isXmlDeclaration());
    }

}