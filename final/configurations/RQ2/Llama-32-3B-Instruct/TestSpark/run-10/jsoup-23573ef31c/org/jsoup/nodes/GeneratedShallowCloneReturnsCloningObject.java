package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.nio.charset.Charset;

public class GeneratedShallowCloneReturnsCloningObject {

    @Test
    public void shallowCloneReturnsCloningObject() {
        Document document = new Document("http://example.com");
        Document cloned = document.shallowClone();
        assertNotEquals(document, cloned);
    }

}