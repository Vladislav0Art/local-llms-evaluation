package ch.jalu.configme.configurationdata;

public class GeneratedTestSetAndGetEmptyComment {

    private java.util.Map<String, String> comments = new java.util.HashMap<>();

    public boolean setComment(String key, String value) {
        if (value.isEmpty()) {
            comments.clear();
        } else {
            comments.put(key, value);
        }
        return true;
    }

    public String getComment(String key) {
        return comments.getOrDefault(key, "");
    }

    public java.util.Map<String, String> getAllComments() {
        return comments;
    }
}

public class TestConfigManager {

    @Test
    public void testSetAndGetEmptyComment() {
        ConfigManager configManager = new ConfigManager();
        configManager.setComment("key", "");
        assertEquals(java.util.Collections.emptyMap(), configManager.getAllComments());
    }

}