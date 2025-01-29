package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestFromUtf8 {

    @Test
    public void testFromUtf8() {
        InputStream in = WordWrap.fromUtf8("resource.txt");
        String text = new BufferedReader(new InputStreamReader(in)).readAllBytes().toString();
        assertTrue(text.equals("This is a test"));
    }

}