package org.jsoup.parser;

public class GeneratedTestValueOf {

    @Test
    public void testValueOf() {
        Tag value = org.jsoup.parser.Tag.valueOf("div");
        assert value.getName() == "div" : "Test failed";
    }

}