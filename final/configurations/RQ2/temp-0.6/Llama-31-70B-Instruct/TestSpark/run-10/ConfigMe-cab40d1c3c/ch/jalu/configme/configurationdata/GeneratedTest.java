package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testAdd() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> property = new Property<>("path", String.class, "value");
        propertyListBuilder.add(property);
        assertTrue(propertyListBuilder.getRootEntries().containsKey("path"));
    }

    @Test
    public void testAdd_ExistingPath() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> property = new Property<>("path", String.class, "value");
        propertyListBuilder.add(property);
        propertyListBuilder.add(property);
    }

    @Test
    public void testAdd_UnknownType() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property = new Property<>("path", Object.class, new Object());
        propertyListBuilder.add(property);
    }

    @Test
    public void testCreate() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> property = new Property<>("path", String.class, "value");
        propertyListBuilder.add(property);
        List<Property<?>> properties = propertyListBuilder.create();
        assertEquals(1, properties.size());
        assertEquals(property, properties.get(0));
    }

}