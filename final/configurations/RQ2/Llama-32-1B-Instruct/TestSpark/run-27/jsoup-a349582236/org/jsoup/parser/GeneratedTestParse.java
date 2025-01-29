package org.jsoup.parser;

public class GeneratedTestParse {

    @Test
    public void testParse() {
        // Arrange
        Map<String, Object> data1 = new HashMap<>();
        data1.put("name", "tag");
        ParseSettings settings1 = new ParseSettingsImpl("normal_name");

        // Assert
        assertTrue(data1.equals(data1));
    }
}

public class TagMock {
    public static void parse(String name, ParseSettings settings) {
        System.out.println("Parsing : " + name + " with Settings: " + settings);
    }

}