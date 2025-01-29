package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestBodyTag {

    public static Document parse(String string) {
        Document doc = new Document();
        Elements tags = doc.getAllElements();

        for (Element tag : tags) {
            if (tag.tagName().equals("text")) {
                String text = tag.text();
                assertEquals(string, text);
            } else if (tag.tagName().equals("div")) {
                parseTag(tag, string);
            }
        }

        return doc;
    }

    public static void parseAppendable(String string) {
        StringReader reader = new StringReader(string);
        Document parsedDoc = parse(reader.toString());
        Element root = parsedDoc.querySelector("body"); // Select the first child element in the document
        if (root == null) {
            System.out.println("No body tag found");
        } else {
            Element bodyTag = root.SelectSingleNode(".//div[@class='text']"); // Find a div with class 'text' inside the body tag
            if (bodyTag != null) {
                assertEquals(string, bodyTag.text());
            }
        }
    }

    public static void parseAppendableWithParser(String string) {
        Document doc = parseAppendable(new DocumentBuilder().parse(string));
    }

    @Test
    public void testBodyTag() {
        GeneratedTest.parseAppendableWithParser("This is a test");
    }

}