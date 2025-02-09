package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;

import java.util.List;
import java.util.Map;

public class GeneratedGetRootEntriesNotEmptyMapTest {

    @Test
    public void getRootEntriesNotEmptyMapTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<String> mockProperty = mock(Property.class);
        when(mockProperty.getPath()).thenReturn("key");
        when(mockProperty.getValue()).thenReturn("value");
        propertyListBuilder.add(mockProperty);

        Map<String, Object> map = propertyListBuilder.getRootEntries();

        Assert.assertFalse(map.isEmpty());
        Assert.assertEquals("value", map.get("key"));
    }

}