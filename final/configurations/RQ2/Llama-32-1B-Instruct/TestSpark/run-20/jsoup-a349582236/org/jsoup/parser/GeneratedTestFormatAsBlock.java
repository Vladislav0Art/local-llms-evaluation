package org.jsoup.parser;

public class GeneratedTestFormatAsBlock {

    @Test
    public void testFormatAsBlock() {
        String expected = "<div>";
        Map<String, Object> map = new HashMap<>();
        map.put("tagName", "div");
        boolean result = org.jsoup(parser).Tag.formatAsBlock(map);
        assert result == true : "Test failed";
    }

}