package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest {

    @Test
    public void testCommentNode() {
        // Test Comment Node
        Document document = new Document();
        Element comment1 = document.createElement("comment");
        comment1.setAttribute("data", "This is a sample comment.");
        comment1.setAttribute("nodeName", "#comment");
        comment1.setAttribute("outerHtmlHead", document.outerHtml());
        Elements data = comment1.select("data");
        assertEquals("This is a sample comment.", data.get(0).text());
    }

    @Test
    public void testCommentData() {
        // Test Comment Data
        Document document = new Document();
        Element comment1 = document.createElement("comment");
        comment1.setAttribute("data", "This is a sample comment.");
        comment1.setAttribute("nodeName", "#comment");
        comment1.setAttribute("outerHtmlHead", document.outerHtml());
        Elements data = comment1.select("data");
        assertEquals("<!--This is a sample comment.-->", data.get(0).text());
    }

    @Test
    public void testCommentTail() {
        // Test Comment Tail
        Document document = new Document();
        Element comment1 = document.createElement("comment");
        comment1.setAttribute("data", "This is a sample comment.");
        comment1.setAttribute("nodeName", "#comment");
        comment1.setAttribute("outerHtmlHead", document.outerHtml());
        Elements data = comment1.select("data");
        assertEquals("<!--This is a sample comment.-->", data.get(0).text());
    }

    @Test
    public void testCommentOuterHtmlTail() {
        // Test Comment Outer Html Tail
        Document document = new Document();
        Element comment1 = document.createElement("comment");
        comment1.setAttribute("data", "This is a sample comment.");
        comment1.setAttribute("nodeName", "#comment");
        comment1.setAttribute("outerHtmlHead", document.outerHtml());
        Elements data = comment1.select("data");
        assertEquals("<!--This is a sample comment.-->", data.get(0).text());
    }

    @Test
    public void testCommentOuterHtmlTailAppend() {
        // Test Comment Outer Html Tail Append
        Document document = new Document();
        Element comment1 = document.createElement("comment");
        comment1.setAttribute("data", "This is a sample comment.");
        comment1.setAttribute("nodeName", "#comment");
        comment1.setAttribute("outerHtmlHead", document.outerHtml());
        Elements data = comment1.select("data");
        assertEquals("<!--This is a sample comment.-->", data.get(0).text());
    }

    @Test
    public void testCommentTagNode() {
        // Test Comment Tag Node
        Document document = new Document();
        Element comment1 = document.createElement("comment");
        comment1.setAttribute("data", "This is a sample comment.");
        comment1.setAttribute("nodeName", "#comment");
        document.appendChild(comment1);
        assertEquals("<!--This is a sample comment.-->", comment1.outerHtml());
    }

    @Test
    public void testCommentNodeAppend() {
        // Test Comment Node Append
        Document document = new Document();
        Element comment1 = document.createElement("comment");
        comment1.setAttribute("data", "This is a sample comment.");
        comment1.setAttribute("nodeName", "#comment");
        document.appendChild(comment1);
    }

    @Test
    public void testCommentInnerHtmlNode() {
        // Test Comment Inner Html Node
        Document document = new Document();
        Element comment1 = document.createElement("comment");
        comment1.setAttribute("data", "This is a sample comment.");
        comment1.setAttribute("nodeName", "#comment");
        comment1.setAttribute("outerHtmlHead", document.outerHtml());
        Elements data = comment1.select("data");
        assertEquals("<!--This is a sample comment.-->", data.get(0).text());
    }

    @Test
    public void testCommentInnerHtmlTailNode() {
        // Test Comment Inner Html Tail Node
        Document document = new Document();
        Element comment1 = document.createElement("comment");
        comment1.setAttribute("data", "This is a sample comment.");
        comment1.setAttribute("nodeName", "#comment");
        comment1.setAttribute("outerHtmlHead", document.outerHtml());
        Elements data = comment1.select("data");
        assertEquals("<!--This is a sample comment.-->", data.get(0).text());
    }

}