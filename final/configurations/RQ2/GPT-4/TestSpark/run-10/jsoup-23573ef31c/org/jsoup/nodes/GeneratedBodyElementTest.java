package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedBodyElementTest {

    @Test
    public void bodyElementTest() {
        Document document = new Document("https://www.google.com");
        Element body = document.body();
        Assert.assertNull(body);
    }

}