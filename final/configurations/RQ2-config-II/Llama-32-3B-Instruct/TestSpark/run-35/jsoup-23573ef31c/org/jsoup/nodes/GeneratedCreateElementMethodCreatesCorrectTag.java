package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedCreateElementMethodCreatesCorrectTag {

    @Test
    public void createElementMethodCreatesCorrectTag() {
        String tagName = "p";
        Element tag = new Document().createElement(tagName);
        assertNotNull(tag);
    }

}