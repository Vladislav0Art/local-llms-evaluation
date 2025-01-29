package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

public class GeneratedTestOPFChecker30_newChapter {

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

}