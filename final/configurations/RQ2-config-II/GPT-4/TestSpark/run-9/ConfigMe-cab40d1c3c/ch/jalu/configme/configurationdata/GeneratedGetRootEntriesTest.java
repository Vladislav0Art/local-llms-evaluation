package ch.jalu.configme.configurationdata;

import ch.jalu.configme.properties.Property;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

public class GeneratedGetRootEntriesTest {

    @Test
    public void getRootEntriesTest() {
        // Given
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        // When
        propertyListBuilder.add(Mockito.mock(Property.class));
        propertyListBuilder.add(Mockito.mock(Property.class));

        // Then
        Assert.assertFalse(propertyListBuilder.getRootEntries().isEmpty());
        Assert.assertEquals(2, propertyListBuilder.getRootEntries().size());
    }

}