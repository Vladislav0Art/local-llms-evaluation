package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.io.ByteArrayOutputStream;

public class GeneratedIsXmlDeclarationDataFragmentTest {

    @Test
    public void IsXmlDeclarationDataFragmentTest() {
        String fragment = "<!test>";
        assertTrue(Comment.isXmlDeclarationData(fragment));
        assertFalse(Comment.isXmlDeclarationData(""));
    }

}