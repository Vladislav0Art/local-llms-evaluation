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

public class GeneratedAsXmlDeclarationReturnsValidXmlDeclarationForEmptyStringData {

    @Test
    public void asXmlDeclarationReturnsValidXmlDeclarationForEmptyStringData() {
        String data = "";
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
        assertTrue(xmlDeclaration.toString().equals("<?xml declaration public \"\" \"UTF-8\"?>"));
    }

}