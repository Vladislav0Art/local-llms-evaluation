package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

public class GeneratedTestOPFChecker30_newDocument {

    @Test
    public void testOPFChecker30_newDocument() {
        // Create a new document
        com.adobe.epubcheck.opf Document opf = new com.adobe.epubcheck.opf();

        // Add some metadata to the document
        opf.addMetadata(new java.util.HashMap<String, String>() {{
            put("title", "Test Document");
            put("author", "John Doe");
            put("subject", "Test Subject");
        }});

        // Create a new chapter
        com.adobe.epubcheck.opf.Chapter ch = new com.adobe.epubcheck.opf.Chapter();

        // Add some text to the chapter
        ch.addText(new java.util.ArrayList<String>() {{
            add("This is the first line of the chapter.");
            add("This is the second line of the chapter.");
        }});

        // Add the metadata and chapter to the document
        opf.addMetadata(opf);
        opf.addChapter(ch);

        // Print the document
        System.out.println(opf.toString());
    }

}