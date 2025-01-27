package org.jsoup.parser;

public class GeneratedGetKnownTags_ReturnsMap {

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