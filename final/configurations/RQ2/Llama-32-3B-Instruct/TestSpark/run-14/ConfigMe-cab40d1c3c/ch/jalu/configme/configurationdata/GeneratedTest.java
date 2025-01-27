package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void addPropertyNotNullTest() {
        List<Property<?>> properties = new ArrayList<>();
        Property<?> property1 = new Property<>("key1", "value1");
        Property<?> property2 = new Property<>("key2", "value2");
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(property1);
        builder.add(property2);
        List<Property<?>> result = builder.create();
        assertEquals(2, result.size());
    }

    @Test
    public void addPropertyNullTest() {
        List<Property<?>> properties = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        try {
            builder.add(null);
            fail("Expected ConfigMeException");
        } catch (ConfigMeException e) {
        }
        assertEquals(0, ((PropertyListBuilder) new PropertyListBuilder()).create().size());
    }

    @Test
    public void createMethodReturnsNotNullTest() {
        List<Property<?>> properties = new ArrayList<>();
        Property<?> property1 = new Property<>("key1", "value1");
        Property<?> property2 = new Property<>("key2", "value2");
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(property1);
        builder.add(property2);
        List<Property<?>> result = builder.create();
        assertNotNull(result);
    }

    @Test
    public void createMethodReturnsNotEmptyTest() {
        List<Property<?>> properties = new ArrayList<>();
        Property<?> property1 = new Property<>("key1", "value1");
        Property<?> property2 = new Property<>("key2", "value2");
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(property1);
        builder.add(property2);
        List<Property<?>> result = builder.create();
        assertTrue(result.size() > 0);
    }

    @Test
    public void getRootEntriesReturnsNotNullTest() {
        Map<String, Object> rootEntries = new LinkedHashMap<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        assertEquals(0, ((PropertyListBuilder) new PropertyListBuilder()).getRootEntries().size());
        builder.add(new Property<>("key1", "value1"));
        builder.add(new Property<>("key2", "value2"));
        Map<String, Object> result = builder.getRootEntries();
        assertNotNull(result);
    }

    @Test
    public void getRootEntriesReturnsNotEmptyTest() {
        Map<String, Object> rootEntries = new LinkedHashMap<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(new Property<>("key1", "value1"));
        builder.add(new Property<>("key2", "value2"));
        Map<String, Object> result = builder.getRootEntries();
        assertTrue(result.size() > 0);
    }

}