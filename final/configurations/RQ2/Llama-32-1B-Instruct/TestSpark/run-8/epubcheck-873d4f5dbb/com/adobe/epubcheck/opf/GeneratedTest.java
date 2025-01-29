package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

public class GeneratedTest {

    @Test
    public void testOPFChecker30_initHandler() {
        // Initialize the handler
        com.adobe.epubcheck.opf(OPFChecker30.class);
    }

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

    @Test
    public void testOPFChecker30_newChapter() {
        // Create a new chapter
        com.adobe.epubcheck.opf.Chapter ch = new com.adobe.epubcheck.opf.Chapter();

        // Add some text to the chapter
        ch.addText(new java.util.ArrayList<String>() {{
            add("This is the first line of the chapter.");
            add("This is the second line of the chapter.");
        }});

        // Create a new paragraph in the chapter
        com.adobe.epubcheck.opf.Paragraph p = new com.adobe.epubcheck.opf.Paragraph();

        // Add some text to the paragraph
        p.addText(new java.util.ArrayList<String>() {{
            add("This is the first line of the paragraph.");
            add("This is the second line of the paragraph.");
        }});

        // Add the metadata and paragraph to the chapter
        ch.addMetadata(ch);
        ch.addParagraph(p);

        // Print the chapter
        System.out.println(ch.toString());
    }

    @Test
    public void testOPFChecker30_newText() {
        // Create a new text element
        com.adobe.epubcheck.opf.TextElement te = new com.adobe.epubcheck.opf.TextElement();

        // Add some text to the element
        te.setText(new java.util.ArrayList<String>() {{
            add("This is the first line of the text.");
            add("This is the second line of the text.");
        }});

        // Create a new paragraph in the document
        com.adobe.epubcheck.opf.Paragraph p = new com.adobe.epubcheck.opf.Paragraph();

        // Add some text to the paragraph
        p.addText(new java.util.ArrayList<String>() {{
            add("This is the first line of the paragraph.");
            add("This is the second line of the paragraph.");
        }});

        // Add the metadata and paragraph to the document
        com.adobe.epubcheck.opf.Document opf = new com.adobe.epubcheck.opf();
        opf.addMetadata(opf);
        opf.addParagraph(p);
        opf.addText(te);

        // Print the document
        System.out.println(opf.toString());
    }

}