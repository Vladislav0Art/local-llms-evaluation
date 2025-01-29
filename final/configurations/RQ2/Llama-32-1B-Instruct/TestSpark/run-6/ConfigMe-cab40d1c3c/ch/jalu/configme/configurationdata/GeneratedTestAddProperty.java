package ch.jalu.configme.configurationdata;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTestAddProperty {

    private List<Map<String, Object>> rootEntries = new ArrayList<>();

    public void addProperty(Property<?> property) {
        rootEntries.add(property.getValue());
    }

}

class TestConfigurationData {

}

public class GeneratedTest {

    @Test
    public void testAddProperty() {
        TestConfigurationData testConfig = new TestConfigurationData();
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.addProperty("key1", "value1");
        builder.addProperty("key2", "value2");

        Map<String, Object> map = builder.getRootEntries();

        // Test if root entries are correct
        List<Map<String, Object>> expectedRootEntries = new ArrayList<>();
        expectedRootEntries.add(Map.of("key1", "value1"));
        expectedRootEntries.add(Map.of("key2", "value2"));

        for (Map<String, Object> entry : map) {
            assertEquals(expectedRootEntries.get(0), entry);
            if (entry.containsKey("key1")) {
                assertEquals(expectedRootEntries.get(0).get("key1"), ((List<Map<String, Object>>) entry.get("value1")).get(0).get("key1"));
            }
            if (entry.containsKey("key2")) {
                assertEquals(expectedRootEntries.get(0).get("key2"), ((List<Map<String, Object>>) entry.get("value2")).get(0).get("key2"));
            }

        }
    }

}

class Property {

    private String key;
    private Object value;

    public Property(String key, Object value) {
        this.key = key;
        this.value = value;
    }
}

}