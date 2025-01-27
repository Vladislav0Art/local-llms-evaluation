package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlHeadIsCalledWithAccumAndDepthWhenProvided {

    @Test
    public void outerHtmlHeadIsCalledWithAccumAndDepthWhenProvided() throws IOException {
        Document document = new Document();
        Element element = document.createElement("div");
        element.attributes().put("accum", "value");
        element.attributes().put("depth", 10);
        document.appendChild(element);
        assertEquals("<!-- accum: value, depth: 10 -->", document.toString());
    }

}