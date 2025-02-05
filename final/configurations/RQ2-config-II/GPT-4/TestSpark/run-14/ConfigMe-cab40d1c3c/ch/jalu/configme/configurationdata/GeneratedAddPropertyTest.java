package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.mockito.Mockito.*;

public class GeneratedAddPropertyTest {

    @Test
    public void addPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property property = mock(Property.class);
        when(property.getPath()).thenReturn("property.path");
        when(property.getDefaultValue()).thenReturn("default_value");

        propertyListBuilder.add(property);

        List<Property<?>> propertyList = propertyListBuilder.create();
        Assert.assertEquals(1, propertyList.size());
        Assert.assertEquals(property, propertyList.get(0));
    }

}