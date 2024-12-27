package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedInsertStartTag_InsertsNewTag {

    @Test
    public void insertStartTag_InsertsNewTag() {
        Token token = new Token(0, 10, "<tag", "");
        Element startTag = new XmlTreeBuilder().insert(token);
        assertNotNull(startTag);
    }

}