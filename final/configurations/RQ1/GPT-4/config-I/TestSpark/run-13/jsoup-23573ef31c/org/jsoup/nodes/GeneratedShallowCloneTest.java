package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedShallowCloneTest {

    @Test
    public void shallowCloneTest() {
        Document document = Document.createShell("https://example.com");
        Document clone = document.shallowClone();
        Assert.assertEquals(document.location(), clone.location());
    }

}