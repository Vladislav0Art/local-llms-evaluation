package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.*;
import org.junit.Assert;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedCreateElementTest {

    @Test
    public void createElementTest() {
        Document document = new Document("http://createelement.com");
        Element element = document.createElement("div");
        Assert.assertEquals("<div></div>", element.toString());
    }

}