package ch.jalu.configme.configurationdata;

import org.junit.Test;
import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class GeneratedCreatePropertyListTest {

    @Test
    public void createPropertyListTest() {
        Property propertyMock1 = mock(Property.class);
        when(propertyMock1.getPath()).thenReturn("property.path1");

        Property propertyMock2 = mock(Property.class);
        when(propertyMock2.getPath()).thenReturn("property.path2");

        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(propertyMock1);
        propertyListBuilder.add(propertyMock2);

        List<Property<?>> propertyList = propertyListBuilder.create();

        assertTrue(propertyList.contains(propertyMock1));
        assertTrue(propertyList.contains(propertyMock2));
    }

}