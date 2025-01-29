package org.jsoup.parser;

public class GeneratedTestSetSelfClosing {

    @Test
    public void testSetSelfClosing() {
        Map<String, Object> map = new HashMap<>();
        Tag value = org.jsoup.parser.Tag.setSelfClosing(map);
        assert value.isSelfClosing() : "Test failed";
    }

}