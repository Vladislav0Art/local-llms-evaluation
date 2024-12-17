package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestEncodingFail {

    @Test
    public void testEncodingFail() {
        String obj = "Invalid encoded string";
        Object clonedObj = EncodeUtil.encode(obj);
        fail("Expected exception not thrown");
    }

}