package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.FormElement;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.util.List;
import javax.annotation.Nullable;

public class GeneratedCreateElementTest {

    @Test
    public void createElementTest() {
        Document doc = new Document("http://example.com");
        Element elem = doc.createElement("div");
        Assert.assertEquals("<div></div>", elem.toString());
    }

}