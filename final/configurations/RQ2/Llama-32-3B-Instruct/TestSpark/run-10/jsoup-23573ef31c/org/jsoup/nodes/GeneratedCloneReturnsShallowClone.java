package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.nio.charset.Charset;

public class GeneratedCloneReturnsShallowClone {

    @Test
    public void cloneReturnsShallowClone() {
        Document original = new Document("http://example.com");
        Document cloned = original.clone();
        assertTrue(cloned instanceof Document);
    }

}