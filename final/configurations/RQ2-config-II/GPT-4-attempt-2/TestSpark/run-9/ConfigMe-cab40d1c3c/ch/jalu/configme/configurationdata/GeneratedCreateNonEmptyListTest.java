package ch.jalu.configme.configurationdata;

import ch.jalu.configme.properties.Property;
import ch.jalu.configme.exception.ConfigMeException;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import java.util.List;
import java.util.Map;

public class GeneratedCreateNonEmptyListTest {

    @Test
    public void createNonEmptyListTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getName()).thenReturn("testProp");

        propertyListBuilder.add(mockProperty);

        List<Property<?>> propertyList = propertyListBuilder.create();
        Assert.assertFalse(propertyList.isEmpty());
        assertEquals(1, propertyList.size());
        Assert.assertEquals(mockProperty, propertyList.get(0));
    }

}