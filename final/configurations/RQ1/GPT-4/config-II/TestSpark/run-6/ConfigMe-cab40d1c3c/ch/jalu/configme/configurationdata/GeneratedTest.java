package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedTest {

    @Test
    public void addSinglePropertyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property = new Property<String>("DataSource.mysql.user", "test");
        builder.add(property);

        Map<String, Object> rootEntries = builder.getRootEntries();
        assertEquals(1, rootEntries.size());
    }

    @Test
    public void addDuplicatePropertyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property = new Property<String>("DataSource.mysql.user", "test");
        builder.add(property);
        builder.add(property);
    }

    @Test
    public void createWithNoAddedPropertiesTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> properties = builder.create();
        assertEquals(0, properties.size());
    }

    @Test
    public void createWithAddedPropertiesTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property1 = new Property<String>("DataSource.mysql.user", "test");
        Property<String> property2 = new Property<String>("DataSource.security.user", "test2");
        builder.add(property1);
        builder.add(property2);

        List<Property<?>> properties = builder.create();
        assertEquals(2, properties.size());
        assertEquals(property1, properties.get(0));
        assertEquals(property2, properties.get(1));
    }

    @Test
    public void addPropertyOverwritingGroupTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property1 = new Property<String>("DataSource", "test");
        Property<String> property2 = new Property<String>("DataSource.mysql.user", "test2");
        builder.add(property1);
        builder.add(property2);
    }

}