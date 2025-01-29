package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedGetWholeTextWithException_Test {

    @Test
    public void getWholeTextWithException_Test() {
        Document document = new Document();
        Element element = document.createElement("body");
        element.appendChild(document.createElement("p"));
        element.appendChild(element);
        try {
            element.text("");
            fail("Expected an exception to be thrown");
        } catch (Exception e) {
            // Expected exception is not actually thrown in this test case
        }
    }

}