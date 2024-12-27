package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.*;

import ch.jalu.configme.configurationdata.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.mockito.Mockito;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.InjectMocks;

public class GeneratedCreateListWithPropertiesTest {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void createListWithPropertiesTest() {
        Property<String> property1 = mock(Property.class);
        Property<String> property2 = mock(Property.class);
        propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(property1);
        propertyListBuilder.add(property2);
        List<Property<?>> properties = propertyListBuilder.create();
        assertEquals(2, properties.size());
        assertTrue(properties.contains(property1));
        assertTrue(properties.contains(property2));
    }

}