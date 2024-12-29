package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTest {

    public static String testParseFragment() {
        Document doc = Jsoup.parse("<html><body></body></html>");
        return doc.body().text();
    }

    public static void main(String[] args) {
        System.out.println(testParseFragment());
    }
}

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class MainTest {

    public static String testParseFragment() {
        Document doc = Jsoup.parse("<html><body><p>Test Paragraph</p></body></html>");
        return doc.body().text();
    }

    public static void main(String[] args) {
        System.out.println(testParseFragment());
    }
}

import org.junit.Test;

public class MainParserTest {

}