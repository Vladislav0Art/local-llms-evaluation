package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

public class GeneratedCreateWithAddedPropertiesTest {

    @Test
    public void createWithAddedPropertiesTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property mockProperty1 = Mockito.mock(Property.class);
        Property mockProperty2 = Mockito.mock(Property.class);
        Mockito.when(mockProperty1.getPath()).thenReturn("property1.path");
        Mockito.when(mockProperty2.getPath()).thenReturn("property2.path");

        propertyListBuilder.add(mockProperty1);
        propertyListBuilder.add(mockProperty2);
        List<Property<?>> propertyList = propertyListBuilder.create();
        assertTrue(propertyList.size() == 2);
    }

}