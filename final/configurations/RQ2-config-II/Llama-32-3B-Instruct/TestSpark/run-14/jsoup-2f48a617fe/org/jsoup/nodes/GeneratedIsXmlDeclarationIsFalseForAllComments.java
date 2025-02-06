package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedIsXmlDeclarationIsFalseForAllComments {

    @Test
    public void isXmlDeclarationIsFalseForAllComments() {
        boolean result1 = new Comment("").isXmlDeclaration();
        assertTrue(result1);

        boolean result2 = new Comment("test").isXmlDeclaration();
        assertTrue(result2);
    }

}