package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedGetRootEntriesWithPropertyTest {

    @Test
    public void getRootEntriesWithPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> property = Mockito.mock(Property.class);
        Mockito.when(property.getPath()).thenReturn("property.path");
        Mockito.when(property.getDefaultValue()).thenReturn("default value");
        propertyListBuilder.add(property);
        Assert.assertFalse(propertyListBuilder.getRootEntries().isEmpty());
    }

}