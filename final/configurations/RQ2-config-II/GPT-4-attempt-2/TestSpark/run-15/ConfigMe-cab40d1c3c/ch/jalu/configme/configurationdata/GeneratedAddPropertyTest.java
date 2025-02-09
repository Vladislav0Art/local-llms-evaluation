package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.doNothing;

public class GeneratedAddPropertyTest {

    @Test
    public void addPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);

        doNothing().when(mockProperty).setValue(Mockito.any());
        propertyListBuilder.add(mockProperty);

        List<Property<?>> propertyList = propertyListBuilder.create();
        assertEquals(1, propertyList.size());
    }

}