package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedInsertComment_InsertsNewComment {

    @Test
    public void insertComment_InsertsNewComment() {
        Token commentToken = new Token(0, 10, "#comment", "");
        new XmlTreeBuilder().insert(commentToken);
    }

}