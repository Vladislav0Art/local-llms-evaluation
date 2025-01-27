package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void create_emptyListTest() {
        List<Property<?>> properties = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> result = builder.create(properties);
        assertTrue(result.isEmpty());
    }

    @Test
    public void add_singlePropertyListTest() {
        List<Property<?>> properties = Collections.singletonList(new Property<>("test"));
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(properties.get(0));
        List<Property<?>> result = builder.create();
        assertEquals(1, result.size());
    }

    @Test
    public void create_singleEntryMapTest() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("test", "value");
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> result = builder.create(map);
        assertEquals(1, result.size());
        assertEquals("value", result.get(0).getValue("test"));
    }

    @Test
    public void create_emptyMapTest() {
        Map<String, Object> map = Collections.emptyMap();
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> result = builder.create(map);
        assertTrue(result.isEmpty());
    }

    @Test
    public void getRootEntries_emptyMapTest() {
        Map<String, Object> map = Collections.emptyMap();
        PropertyListBuilder builder = new PropertyListBuilder();
        assertEquals(Collections.emptyMap(), builder.getRootEntries());
    }

    @Test
    public void add_nonePropertyExceptionTest() {
        try {
            new PropertyListBuilder().add(null);
            fail("Expected ConfigMeException");
        } catch (ConfigMeException e) {
            // Expected
        }
    }

    @Test
    public void create_addMultiplePropertiesTest() {
        List<Property<?>> properties = Arrays.asList(new Property<>("test1"), new Property<>("test2"));
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(properties.get(0));
        builder.add(properties.get(1));
        List<Property<?>> result = builder.create();
        assertEquals(2, result.size());
    }

}