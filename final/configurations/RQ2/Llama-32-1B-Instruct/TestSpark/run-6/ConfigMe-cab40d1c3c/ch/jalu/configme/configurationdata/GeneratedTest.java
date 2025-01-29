package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    public static void main(String[] args) {

        PropertyListBuilder builder = new PropertyListBuilder();
        Property testConfigProperty1 = new Property("key1", "value1");
        Property testConfigProperty2 = new Property("key2", "value2");

        builder.addProperty(testConfigProperty1);
        builder.addProperty(testConfigProperty2);

        Map<String, Object> map = builder.getRootEntries();

        TestGeneratedTest.testGetRootEntries(map, builder);
    }
}

class Property {
    private String key;
    private Object value;

    public Property(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public Map<String, Object> getValue() {
        return new HashMap<>();
    }
}

class TestGeneratedTest {

    @Test
    public void testGetRootEntries() {
        TestConfigurationData testConfig = new TestConfigurationData();
        PropertyListBuilder builder = new PropertyListBuilder();

        // Add properties to the root entries
        Property testConfigProperty1 = new Property("key1", "value1");
        Property testConfigProperty2 = new Property("key2", "value2");

        builder.addProperty(testConfigProperty1);
        builder.addProperty(testConfigProperty2);

        Map<String, Object> map = builder.getRootEntries();

        // Test if getRootEntries is correct
        List<Map<String, Object>> expectedRootEntries = new ArrayList<>();
        expectedRootEntries.add(Map.of("key1", "value1"));
        expectedRootEntries.add(Map.of("key2", "value2"));

        for (Map<String, Object> entry : map) {
            assertEquals(expectedRootEntries.get(0), entry);
            if (entry.containsKey("key1")) {
                assertEquals(expectedRootEntries.get(0).get("key1"), ((List<Map<String, Object>>) entry.get("value1")).get(0));
            }
        }

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Property testConfigProperty = new TestConfigurationData().testConfigProperty(entry.getKey(), entry.getValue());
            assertEquals(testConfigProperty, getTestConfigProperty(builder, entry.getKey()));
        }
    }

    private static Property getTestConfigProperty(PropertyListBuilder builder, String key) {
        Property testConfigProperty = null;
        for (Property property : builder.getEntries()) {
            if (property.getKey().equals(key)) {
                testConfigProperty = property;
                break;
            }
        }
        return testConfigProperty;
    }

}