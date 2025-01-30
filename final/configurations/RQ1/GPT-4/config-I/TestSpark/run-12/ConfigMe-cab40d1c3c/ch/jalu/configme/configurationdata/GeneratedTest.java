package ch.jalu.configme.configurationdata;

import org.junit.Test;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class GeneratedTest {

    @Test
    public void addWhenPropertyExistsTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property prop1 = new StringProperty("Test.Property", "default");
        Property prop2 = new StringProperty("Test.Property", "default2");
        propertyListBuilder.add(prop1);

        // Property with same path, should throw ConfigMeException
        propertyListBuilder.add(prop2);
    }

    @Test
    public void addWhenSubPropertyExistsTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property prop1 = new StringProperty("Test.Property", "default");
        Property prop2 = new StringProperty("Test", "default2");
        propertyListBuilder.add(prop1);

        // Property which is a subset of another property path, should throw ConfigMeException
        propertyListBuilder.add(prop2);
    }

    @Test
    public void addTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property prop1 = new StringProperty("Test.Property1", "default");
        Property prop2 = new StringProperty("Test.Property2", "default2");
        propertyListBuilder.add(prop1);
        propertyListBuilder.add(prop2);

        List<Property<?>> propertyList = propertyListBuilder.create();

        // Both properties should be presents in the list
        assertThat(propertyList, hasItems(prop1, prop2));
    }

    @Test
    public void createTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property prop1 = new StringProperty("Test.Property1", "default");
        Property prop2 = new StringProperty("Test.Property2", "default2");
        propertyListBuilder.add(prop1);
        propertyListBuilder.add(prop2);

        List<Property<?>> propertyList = propertyListBuilder.create();

        // Checking the order of insertion
        assertThat(propertyList.get(0), is(prop1));
        assertThat(propertyList.get(1), is(prop2));

        Property prop3 = new StringProperty("Test2.Property1", "default");
        Property prop4 = new StringProperty("Test2.Property2", "default2");
        propertyListBuilder.add(prop3);
        propertyListBuilder.add(prop4);

        List<Property<?>> propertyList2 = propertyListBuilder.create();

        // Checking the order of insertion after new properties added
        assertThat(propertyList2.get(2), is(prop3));
        assertThat(propertyList2.get(3), is(prop4));
    }

    @Test
    public void getRootEntriesTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property prop1 = new StringProperty("Test.Property1", "default");
        Property prop2 = new StringProperty("Test.Property2", "default2");
        propertyListBuilder.add(prop1);
        propertyListBuilder.add(prop2);

        // Check object is not null and has the correct content
        assertThat(propertyListBuilder.getRootEntries(), is(not(null)));
        assertThat(((Map<String, Object>) propertyListBuilder.getRootEntries().get("Test")).get("Property1"), is(prop1));
        assertThat(((Map<String, Object>) propertyListBuilder.getRootEntries().get("Test")).get("Property2"), is(prop2));
    }

}