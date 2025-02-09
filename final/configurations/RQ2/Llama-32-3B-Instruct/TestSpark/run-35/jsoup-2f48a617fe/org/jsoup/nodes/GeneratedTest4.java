package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest4 {

    private String data;
    private String nodeName;

    public Comment(String data, String nodeName) {
        this.data = data;
        this.nodeName = nodeName;
    }

    public String getData() {
        return data;
    }

    public String getNodeName() {
        return nodeName;
    }
}

import org.jsoup.Jsoup;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    @Test
    public void test4() throws Exception {
        Comment comment = new Comment("data", "nodeName");
        assertTrue(comment.isXmlDeclaration());
    }

}