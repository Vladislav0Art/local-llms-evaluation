package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedInsertDoctypeTokenTest {

    @Test
    public void insertDoctypeTokenTest() {
        XmlTreeBuilder parser = new XmlTreeBuilder();
        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.name("html");
        parser.insert(doctypeToken);
    }

}