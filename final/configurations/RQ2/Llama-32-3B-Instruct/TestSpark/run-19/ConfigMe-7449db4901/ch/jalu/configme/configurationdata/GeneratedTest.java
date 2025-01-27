package ch.jalu.configme.configurationdata;

public class GeneratedTest {

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
    public void testGetComment() {
        ConfigManager configManager = new ConfigManager();
        assertTrue(configManager.setComment("key", "value"));
        assertEquals("value", configManager.getComment("key"));
    }

    @Test
    public void testSetAndGetCommentMultiple() {
        ConfigManager configManager = new ConfigManager();
        configManager.setComment("key1", "value1");
        configManager.setComment("key2", "value2");
        assertTrue(configManager.getComment("key1").contains("value1"));
        assertTrue(configManager.getComment("key2").contains("value2"));
    }

    @Test
    public void testSetAndGetEmptyComment() {
        ConfigManager configManager = new ConfigManager();
        configManager.setComment("key", "");
        assertEquals(java.util.Collections.emptyMap(), configManager.getAllComments());
    }

}