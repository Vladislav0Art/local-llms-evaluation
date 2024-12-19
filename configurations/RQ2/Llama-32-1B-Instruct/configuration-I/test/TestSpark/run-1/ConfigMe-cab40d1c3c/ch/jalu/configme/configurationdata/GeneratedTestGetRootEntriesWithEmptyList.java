package ch.jalu.configme.configurationdata;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestGetRootEntriesWithEmptyList {

    public static String createPropertyList() {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(new Property[]{});
    }

    public static List<Property> createPropertyListWithDifferentTypes() {
        List<Property> properties = Arrays.asList(
                new Property("key1", "type1"),
                new Property("key2", "type2")
        );
        return properties;
    }

    @Test
    public void testGetRootEntriesWithEmptyList() {
        ObjectMapper mapper = new ObjectMapper();
        String json = createPropertyList();
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property> properties = builder.getRootEntries();
        assertTrue(properties.isEmpty());
    }
}

class Property {
    private final String key;
    private final String type;

    public Property(String key, String type) {
        this.key = key;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Property{" +
                "key='" + key + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

class PropertyListBuilder {
    private final Map<String, Object> rootEntries;

    public void add(Property property) {
        if (property != null) {
            this.rootEntries.put(property.getKey(), property.getType());
        } else {
            throw new NullPointerException("Property cannot be null");
        }
    }

    @NotNull
    public List<Property<?>> create() {
        return new ArrayList<>(rootEntries);
    }

    protected final @NotNull Map<String, Object> getRootEntries() {
        return rootEntries;
    }

}