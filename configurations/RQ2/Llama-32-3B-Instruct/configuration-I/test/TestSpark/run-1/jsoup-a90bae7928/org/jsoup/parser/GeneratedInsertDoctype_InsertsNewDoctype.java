package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedInsertDoctype_InsertsNewDoctype {

    @Test
    public void insertDoctype_InsertsNewDoctype() {
        Token d = new Token(0, 10, "<!DOCTYPE>", "");
        new XmlTreeBuilder().insert(d);
    }

}