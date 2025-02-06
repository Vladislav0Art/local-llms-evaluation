package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Document;

public class GeneratedConvert_jsoup_doc {

    @Test
    public void convert_jsoup_doc() {
        Document inDoc = new Document();
        Document outDoc = W3CDom.convert(inDoc);
        assertNotNull(outDoc);
    }

}