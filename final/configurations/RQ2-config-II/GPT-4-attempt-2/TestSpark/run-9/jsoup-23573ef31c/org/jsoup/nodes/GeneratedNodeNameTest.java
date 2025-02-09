package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.*;
import org.junit.Assert;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        Document document = new Document("http://nodenametest.com");
        Assert.assertEquals("#document", document.nodeName());
    }

}