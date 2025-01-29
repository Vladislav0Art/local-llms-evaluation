package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedOuterHtmlHead_test {

    public String nodeName() {
        return "text";
    }

    public void setText(String text) {
        this.text = text;
    }

    @Test
    public void outerHtmlHead_test() {
        // This test is currently failing due to the fact that the node has no innerHTML attribute.
        Assert.assertFalse(true);
    }

}