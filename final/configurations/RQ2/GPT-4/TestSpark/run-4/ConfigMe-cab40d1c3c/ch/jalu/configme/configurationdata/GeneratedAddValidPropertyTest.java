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

public class GeneratedAddValidPropertyTest {

    @Test
    public void addValidPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> property = new StringProperty("path.to.property", "default-value");
        try {
            propertyListBuilder.add(property);
        } catch (ConfigMeException e) {
            fail("Adding property should not throw exception");
        }
        assertTrue(propertyListBuilder.getRootEntries().containsKey("path.to.property"));
    }

}