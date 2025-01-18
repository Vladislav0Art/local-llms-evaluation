package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedLocationTest {

    @Test
    public void locationTest() {
        Document document = new Document("https://www.google.com");
        String location = document.location();
        Assert.assertEquals("https://www.google.com", location);
    }

}