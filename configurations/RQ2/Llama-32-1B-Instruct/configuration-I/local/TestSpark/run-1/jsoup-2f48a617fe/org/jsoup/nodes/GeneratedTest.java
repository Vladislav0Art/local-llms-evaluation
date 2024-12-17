package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest {

    public static String createComment(String content) {
        Document document = new Document();
        Elements paragraphs = document.getElementsByTagName("p");
        for (int i = 0; i < paragraphs.size(); i++) {
            Element paragraph = (Element) paragraphs.get(i);
            Element comment = document.createElement("comment");
            comment.appendChild(document.createTextNode(content));
            paragraph.appendChild(comment);
        }
        return document.outerHTML().trim();
    }

}