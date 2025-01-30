package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.OutputSettings;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedCreateFromEncodedTest {

    @Test
    public void createFromEncodedTest() {
        TextNode createdTextNode = TextNode.createFromEncoded("&lt;div&gt;Sample Text&lt;/div&gt;");
        Assert.assertEquals("<div>Sample Text</div>", createdTextNode.text());
    }

}