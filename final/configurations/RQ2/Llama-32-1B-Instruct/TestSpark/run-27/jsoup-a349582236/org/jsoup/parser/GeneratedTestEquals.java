package org.jsoup.parser;

public class GeneratedTestEquals {

    @Test
    public void testEquals() {
        Map<String, Object> data1 = new HashMap<>();
        data1.put("name", "tag");
        ParseSettings settings1 = new ParseSettingsImpl("normal_name");

        Map<String, Object> data2 = new HashMap<>();
        data2.put("name", "tag");
        ParseSettings settings2 = new ParseSettingsImpl("normal_name");

        assertTrue(data1.equals(data2));
    }
}

}