package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import ch.jalu.configme.exception.ConfigMeException;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedTest {

    @Test
    public void addNewPropertyToBuilderTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> testProperty = new StringProperty("testPropertyPath", "defaultValue");
        propertyListBuilder.add(testProperty);
        List<Property<?>> properties = propertyListBuilder.create();
        assertTrue("Property list size should be 1.", properties.size() == 1);
        assertEquals("Property is different.", testProperty, properties.get(0));
    }

    @Test
    public void addDuplicatedPropertyToBuilderTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> testProperty = new StringProperty("testPropertyPath", "defaultValue");
        propertyListBuilder.add(testProperty);
        propertyListBuilder.add(testProperty);
        List<Property<?>> properties = propertyListBuilder.create();
        assertTrue("Property list size should be 1.", properties.size() == 1);
    }

    @Test
    public void getRootEntriesWhenNoPropertiesTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertTrue("Root entries should be empty.", rootEntries.isEmpty());
    }

    @Test
    public void getRootEntriesWhenPropertiesExistTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> testProperty1 = new StringProperty("testPropertyPath1", "defaultValue1");
        Property<String> testProperty2 = new StringProperty("testPropertyPath2", "defaultValue2");
        propertyListBuilder.add(testProperty1);
        propertyListBuilder.add(testProperty2);
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertTrue("Root entries should contain 2 elements.", rootEntries.size() == 2);
    }

}