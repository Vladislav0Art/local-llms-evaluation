package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.*;

import ch.jalu.configme.configurationdata.Property;
import ch.jalu.configme.configurationdata.PropertyListBuilder;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.InjectMocks;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddPropertyTest {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void addPropertyTest() {
        Property<String> property = Mockito.mock(Property.class);
        propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(property);
        verify(property, times(1)).setParent(any());
    }

}