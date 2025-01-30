package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void addPropertyWithExistingPathTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property1 = new StringProperty("test", "default");
        Property<String> property2 = new StringProperty("test", "default");
        builder.add(property1);
        builder.add(property2);
    }

    @Test
    public void createPropertyListTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property = new StringProperty("test.path", "default");
        builder.add(property);
        List<Property<?>> properties = builder.create();
        assertTrue(properties.contains(property));
    }

    @Test
    public void getRootEntriesTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property = new StringProperty("test", "default");
        builder.add(property);
        assertEquals(property, ((Map<String, Object>) getPropertyRootEntries(builder)).get("test"));
    }

    private Map<String, Object> getPropertyRootEntries(PropertyListBuilder builder) {
        try {
            Field field = PropertyListBuilder.class.getDeclaredField("rootEntries");
            field.setAccessible(true);
            return (Map<String, Object>) field.get(builder);
        } catch (NoSuchFieldException | IllegalAccessException ex) {
            throw new RuntimeException("Failed to get rootEntries via reflection", ex);
        }
    }

    @Test
    public void getRootEntriesTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property = new StringProperty("test", "default");
        builder.add(property);
        assertEquals(property, ((Map<String, Object>) getPropertyRootEntries(builder)).get("test"));
    }

    @SuppressWarnings("unchecked")
    private Map<String, Object> getPropertyRootEntries(PropertyListBuilder builder) {
        try {
            Field field = PropertyListBuilder.class.getDeclaredField("rootEntries");
            field.setAccessible(true);
            return (Map<String, Object>) field.get(builder);
        } catch (NoSuchFieldException | IllegalAccessException ex) {
            throw new RuntimeException("Failed to get rootEntries via reflection", ex);
        }
    }

    @Test
    public void getRootEntriesTest() throws Exception {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property = new StringProperty("test", "default");
        builder.add(property);
        assertEquals(property, getPropertyFromRootEntries(builder, "test"));
    }

    private Object getPropertyFromRootEntries(PropertyListBuilder builder, String path) throws Exception {
        Field field = PropertyListBuilder.class.getDeclaredField("rootEntries");
        field.setAccessible(true);
        Map<String, Object> rootEntries = (Map<String, Object>) field.get(builder);
        return rootEntries.get(path);
    }

}