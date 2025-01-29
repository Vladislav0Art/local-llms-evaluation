package org.jsoup.parser;

public class GeneratedTestHasStartTag {

    @Test
    public void testHasStartTag() {
        JsoupParser jSoup = new JsoupParser();
        System.out.println(jSoup.hasStartTag(new Element("tag1")));
        System.out.println(jSoup.hasStartTag(new Element("tag2")));
        System.out.println(jSoup.hasStartTag(null));
    }

}