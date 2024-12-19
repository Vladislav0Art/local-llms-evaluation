package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedWriteCharacterArrayAndInts {

    @Test
    public void writeCharacterArrayAndInts() throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append('a');
        sb.append(1);
        char[] chars = {'b', 'c'};
        sb.append(chars, 0, 2);

        assertEquals("abc", sb.toString());
    }

}