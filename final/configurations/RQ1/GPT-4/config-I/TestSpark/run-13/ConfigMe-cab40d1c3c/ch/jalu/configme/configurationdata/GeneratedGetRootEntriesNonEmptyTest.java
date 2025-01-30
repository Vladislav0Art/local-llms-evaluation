package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.StringProperty;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GeneratedGetRootEntriesNonEmptyTest {

    @Test
    public void getRootEntriesNonEmptyTest() {
        Property<String> property = new StringProperty("path.to.property", "test");
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(property);
        assertFalse(propertyListBuilder.getRootEntries().isEmpty());
    }

}