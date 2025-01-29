package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTest {

    public static String build(String input, int offset) {
        return Jsoup.parse(input + offset).toString();
    }

    @Test
    public void testBuild_Personalize() {
        setInput("a");
        assertEquals("ab0", build("a", 0));
        setInput("b");
        assertEquals("ab1", build("a", 0));
        setInput("c");
        assertEquals("abc2", build("a", 0));
    }

    public void setInput(String input) {
        this.input = input;
    }
}

}