package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetRootEntriesNonEmptyTest {

    @Test
    public void getRootEntriesNonEmptyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("property.path");

        propertyListBuilder.add(mockProperty);
        Assert.assertFalse(propertyListBuilder.getRootEntries().isEmpty());
    }

}