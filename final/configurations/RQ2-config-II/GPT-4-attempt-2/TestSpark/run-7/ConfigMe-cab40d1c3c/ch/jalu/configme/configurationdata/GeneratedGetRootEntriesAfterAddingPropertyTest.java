package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.util.List;
import java.util.Map;

public class GeneratedGetRootEntriesAfterAddingPropertyTest {

    @Test
    public void getRootEntriesAfterAddingPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        Property mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("test.path");

        propertyListBuilder.add(mockProperty);

        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();

        Assert.assertNotNull(rootEntries);
        Assert.assertEquals(1, rootEntries.size());
    }

}