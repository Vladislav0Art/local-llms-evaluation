package org.jsoup.parser;

public class GeneratedTestIsSelfClosing {

    @Test
    public void testIsSelfClosing() {
        Map<String, Object> expected = new HashMap<>();
        expected.put("is_self_closing", true);
        Tag tag = org.jsoup.parser.Tag.valueOf("img");
        assertTrue(tag.isSelfClosing());
    }

}