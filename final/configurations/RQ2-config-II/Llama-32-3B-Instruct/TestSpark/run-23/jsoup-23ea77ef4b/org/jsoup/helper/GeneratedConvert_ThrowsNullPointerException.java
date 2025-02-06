package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

public class GeneratedConvert_ThrowsNullPointerException {

    @Test
    public void convert_ThrowsNullPointerException() {
        org.jsoup.nodes.Document nullDoc = null;
        Document nullOut = W3CDom.convert(nullDoc);
    }

}