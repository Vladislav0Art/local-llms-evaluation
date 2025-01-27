package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedAddingExistingAttributeIncreasesSize {

    @Test
    public void addingExistingAttributeIncreasesSize() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Document doc = Document.parse("a=\"value\" b=\"value\"");
        Attributes attributes = doc.attributes();
        assertEquals(2, attributes.size());
    }

}