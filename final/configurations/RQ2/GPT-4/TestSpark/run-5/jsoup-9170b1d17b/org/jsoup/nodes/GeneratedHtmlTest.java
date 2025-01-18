package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GeneratedHtmlTest {

    @Test
    public void htmlTest() throws IOException {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        String html = attributes.html();
        Assert.assertEquals("key=\"value\" ", html);
    }

}