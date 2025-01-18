package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedGetRootEntriesWithPropertiesTest {

    @Test
    public void getRootEntriesWithPropertiesTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> property1 = new StringProperty("path.to.property1", "default-value1");
        Property<String> property2 = new StringProperty("path.to.property2", "default-value2");
        propertyListBuilder.add(property1);
        propertyListBuilder.add(property2);
        assertEquals(2, propertyListBuilder.getRootEntries().size());
        assertTrue(propertyListBuilder.getRootEntries().containsKey("path.to.property1"));
        assertTrue(propertyListBuilder.getRootEntries().containsKey("path.to.property2"));
    }

}