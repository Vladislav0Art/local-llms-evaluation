package org.jsoup.parser;

import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GeneratedInsertCharacter_InsertsNewCharacter {

    @Test
    public void insertCharacter_InsertsNewCharacter() {
        Token token = new Token(0, 10, "!", "");
        new XmlTreeBuilder().insert(token);
    }

}