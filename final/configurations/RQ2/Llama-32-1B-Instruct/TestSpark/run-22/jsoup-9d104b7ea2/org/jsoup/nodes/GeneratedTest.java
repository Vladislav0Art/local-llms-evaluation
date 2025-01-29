package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest {

    public static String getText(Node node) {
        return node.getText().toString();
    }

    public static boolean isLeaf() {
        return getText(document).trim().isEmpty();
    }

}