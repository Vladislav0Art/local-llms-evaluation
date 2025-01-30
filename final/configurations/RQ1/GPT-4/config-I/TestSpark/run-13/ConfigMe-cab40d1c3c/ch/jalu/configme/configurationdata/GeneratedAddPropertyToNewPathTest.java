package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedAddPropertyToNewPathTest {

    @Test
    public void addPropertyToNewPathTest() {
        Property<String> property = new StringProperty("path.that.is.new", "test");
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(property);
        assertTrue(propertyListBuilder.getRootEntries().get("path") instanceof java.util.Map);
    }

}