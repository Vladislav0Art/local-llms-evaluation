package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;

import java.util.List;
import java.util.Map;

public class GeneratedCreateNotEmptyListTest {

    @Test
    public void createNotEmptyListTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property mockProperty = mock(Property.class);
        propertyListBuilder.add(mockProperty);

        List<Property<?>> propertyList = propertyListBuilder.create();

        Assert.assertFalse(propertyList.isEmpty());
    }

}