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

public class GeneratedGetRootEntriesWhenPropertiesExistTest {

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