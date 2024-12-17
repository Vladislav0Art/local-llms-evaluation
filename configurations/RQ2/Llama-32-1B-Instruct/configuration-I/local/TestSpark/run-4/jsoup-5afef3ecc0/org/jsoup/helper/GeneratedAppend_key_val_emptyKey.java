package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;
import org.junit.jupiter.api.Test;

import java.net.URL;

public class GeneratedAppend_key_val_emptyKey {

    @Test
    public void append_key_val_emptyKey() {
        String expectedKeyValMap = "";
        URLKeyValMap kvMap = new URLKeyValMap().setKey("").toString();
        assertEquals(expectedKeyValMap, kvMap.toString());
    }

}