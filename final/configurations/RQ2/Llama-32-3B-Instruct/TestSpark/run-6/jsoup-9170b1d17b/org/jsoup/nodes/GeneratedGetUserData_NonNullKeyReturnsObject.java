package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedGetUserData_NonNullKeyReturnsObject {

    @Test
    public void getUserData_NonNullKeyReturnsObject() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Document doc = Document.parse("data=\"value\" b=\"value\"");
        Attributes attributes = doc.attributes();
        assertEquals(doc, attributes.getUserData("data"));
    }

}