package org.jsoup.parser;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedProcessExceptionTest {

    @Test
    public void processExceptionTest() {
        final Token.Comment commentToken = new Token.Comment();
        final XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.process(commentToken);
    }

}