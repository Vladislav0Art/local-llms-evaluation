package org.jsoup.parser;

public class GeneratedTestValueOf {

    @Test
    public void testValueOf() {
        Map<String, Object> settings = new HashMap<>();
        settings.put("tag_name", "my_tag");
        Tag tag = ValueOf.valueOf("my_tag", settings);
        assertEquals("my_tag", tag.tagName());
    }

}