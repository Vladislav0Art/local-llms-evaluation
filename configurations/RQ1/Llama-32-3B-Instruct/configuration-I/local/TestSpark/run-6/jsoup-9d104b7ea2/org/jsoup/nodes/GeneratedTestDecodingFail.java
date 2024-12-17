package org.jsoup.nodes;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestDecodingFail {

    @Test
    public void testDecodingFail() {
        String obj = "Invalid encoded string";
        String decodedObj = DecodeUtil.decode(EncodeUtil.encode(obj));
        assertEquals(obj, decodedObj);
    }
}

}