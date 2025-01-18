package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedHeadElementTest {

    @Test
    public void headElementTest() {
        Document document = new Document("https://www.google.com");
        Element head = document.head();
        Assert.assertNull(head);
    }

}