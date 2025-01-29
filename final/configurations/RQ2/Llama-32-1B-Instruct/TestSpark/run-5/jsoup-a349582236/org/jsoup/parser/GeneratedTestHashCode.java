package org.jsoup.parser;

public class GeneratedTestHashCode {

    @Test
    public void testHashCode() {
        String[] tags = {"img", "div"};
        Map<String, Object> map = new HashMap<>();
        map.put("img", new TagImpl("img"));
        map.put("div", new TagImpl("div"));

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            Assert.assertEquals(entry.getKey(), (String) value);
        }
    }

}