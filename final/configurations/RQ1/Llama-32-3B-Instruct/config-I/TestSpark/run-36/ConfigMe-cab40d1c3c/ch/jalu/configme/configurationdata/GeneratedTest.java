package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedTest {

    @Test
    public void addPropertyToRootWithExistingPath_ThrowsException() {
        Property<?> property = new Property<>("DataSource.mysql");
        PropertyListBuilder builder = new PropertyListBuilder();
        try {
            builder.add(property);
            fail("Expected ConfigMeException to be thrown");
        } catch (ConfigMeException e) {
            assertEquals("Path at '" + property.getPath() + "' already exists", e.getMessage());
        }
    }

    @Test
    public void addPropertyToEmptyRootGroup_AddsPropertyToList() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> properties = builder.create();
        assertFalse(properties.isEmpty());
    }

    @Test
    public void collectEntries_SingleMapEntry_ReturnsOneEntry() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("key", "value");
        List<Property<?>> result = new ArrayList<>();
        PropertyListBuilder collector = new PropertyListBuilder();
        collector.collectEntries(map, result);
        assertEquals(1, result.size());
    }

    @Test
    public void collectEntries_NestedMapEntry_ReturnsAllSubentries() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("key", "nestedValue");
        ((Map<String, Object>) map.get("key")).put("subKey", "subValue");
        List<Property<?>> result = new ArrayList<>();
        PropertyListBuilder collector = new PropertyListBuilder();
        collector.collectEntries(map, result);
        assertEquals(2, result.size());
    }

    @Test
    public void asTypedMap_TypeCastSuccess() {
        Object o = "value";
        Map<String, Object> typedMap = PropertyListBuilder.asTypedMap(o);
        assertTrue(typedMap.containsKey("value"));
    }

    @Test
    public void asTypedMap_InvalidType_ThrowsException() {
        Object o = 123;
        try {
            PropertyListBuilder.asTypedMap(o);
            fail("Expected ConfigMeException to be thrown");
        } catch (ConfigMeException e) {
            assertEquals("Value of unknown type found at '': " + o, e.getMessage());
        }
    }

    @Test
    public void getRootEntries_ReturnsInitializedMap() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> map = builder.getRootEntries();
        assertNotNull(map);
    }
}

class MockProperty implements Property<?> {

    private final String path;

    public MockProperty(String path) {
        this.path = path;
    }

    @Override
    public String getPath() {
        return path;
    }

}