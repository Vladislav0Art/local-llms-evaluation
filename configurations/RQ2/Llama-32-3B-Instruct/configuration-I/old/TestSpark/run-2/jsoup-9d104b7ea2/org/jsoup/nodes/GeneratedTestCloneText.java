package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class GeneratedTestCloneText {

    @Test
    public void testCloneText() {
        Document document = Jsoup.parse("");
        String text = "text";
        String clonedText = document.text();
        assertEquals(text, clonedText);
    }
}

class Node {
    private boolean isBlank;

    public Node(boolean isBlank) {
        this.isBlank = isBlank;
    }

    public boolean isBlank() {
        return isBlank;
    }
}

public class Main {
    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("TestDocument");
    }

}