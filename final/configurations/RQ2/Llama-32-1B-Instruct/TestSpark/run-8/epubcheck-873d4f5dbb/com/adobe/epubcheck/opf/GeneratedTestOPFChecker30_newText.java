package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

public class GeneratedTestOPFChecker30_newText {

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