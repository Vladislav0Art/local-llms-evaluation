package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class GeneratedTest {

    @Test
    public void addPropertyEmptyListTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> properties = builder.create();
        assertEquals(0, properties.size());
        builder.add(new Property());
        assertNotNull(properties);
        assertTrue(properties.isEmpty());
    }

    @Test
    public void addPropertySingleElementListTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> properties = builder.create();
        builder.add(new Property<>());
        assertEquals(1, properties.size());
        assertSame(builder.getRootEntries().get("0"), properties.get(0));
    }

    @Test
    public void addPropertyMultipleElementListTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> properties = builder.create();
        builder.add(new Property<>());
        builder.add(new Property<>());
        assertEquals(2, properties.size());
        assertTrue(properties.get(0).equals(builder.getRootEntries().get("0")));
        assertTrue(properties.get(1).equals(builder.getRootEntries().get("1")));
    }

    @Test
    public void createListIsNotEmptyWhenPropertyAddedTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> properties = builder.create();
        assertFalse(properties.isEmpty());
    }

    @Test
    public void createListIsEmptyWhenNoPropertiesAddedTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> properties = builder.create();
        assertTrue(properties.isEmpty());
    }

    @Test
    public void getRootEntriesMapIsNotEmptyWhenPropertyAddedTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> entries = builder.getRootEntries();
        assertFalse(entries.isEmpty());
    }

    @Test
    public void getRootEntriesMapIsEmptyWhenNoPropertiesAddedTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> entries = builder.getRootEntries();
        assertTrue(entries.isEmpty());
    }
}

class MockProperty implements Property<?> {
    private final String id;
    private final String name;

    public MockProperty(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }
}

}