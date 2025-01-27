package org.jsoup.parser;

public class GeneratedTest {

    @Test
    public void getName_AlreadyInitialized_ReturnsName() {
        String name = "div";
        Tag tag = new Tag(name);
        Mockito.when(Tag.valueOf(name)).thenReturn(tag);
        assertEquals(name, tag.getName());
    }

    public static class Tag {
        private final String name;

        public Tag(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}

@Test
public void getKnownTags_ReturnsMap() {
    Map<String, String> knownTags = new HashMap<>();
    knownTags.put("div", "block");
    knownTags.put("span", "inline");

    ParseSettings settings = new ParseSettings();
    settings.setKnownTags(knownTags);
    assertEquals(settings.getKnownTags(), knownTags);
}

public static class ParseSettings {
    private Map<String, String> knownTags;

    public void setKnownTags(Map<String, String> knownTags) {
        this.knownTags = knownTags;
    }

    public Map<String, String> getKnownTags() {
        return knownTags;
    }
}

}