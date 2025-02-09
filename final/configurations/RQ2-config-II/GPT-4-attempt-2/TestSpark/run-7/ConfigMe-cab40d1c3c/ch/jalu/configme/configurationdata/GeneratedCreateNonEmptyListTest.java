package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.util.List;
import java.util.Map;

public class GeneratedCreateNonEmptyListTest {

    @Test
    public void createNonEmptyListTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        Property mockProperty = Mockito.mock(Property.class);
        Mockito.when(mockProperty.getPath()).thenReturn("test.path");

        propertyListBuilder.add(mockProperty);
        List<Property<?>> properties = propertyListBuilder.create();

        Assert.assertNotNull(properties);
        Assert.assertEquals(1, properties.size());
    }

}