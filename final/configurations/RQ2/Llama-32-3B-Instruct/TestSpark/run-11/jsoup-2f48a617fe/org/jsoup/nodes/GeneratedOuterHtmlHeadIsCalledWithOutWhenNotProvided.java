package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedOuterHtmlHeadIsCalledWithOutWhenNotProvided {

    @Test
    public void outerHtmlHeadIsCalledWithOutWhenNotProvided() throws IOException {
        Document document = new Document();
        Element element = document.createElement("div");
        document.appendChild(element);
        assertEquals("<!-- -->", document.toString());
    }

}