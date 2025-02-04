package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.io.ByteArrayOutputStream;

public class GeneratedIsXmlDeclarationDataTest {

    @Test
    public void IsXmlDeclarationDataTest() {
        assertTrue(Comment.isXmlDeclarationData("!--test-->");
		));
        assertFalse(Comment.isXmlDeclarationData(""));
    }

}