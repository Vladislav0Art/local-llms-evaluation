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

public class GeneratedAddPropertyTest {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void addPropertyTest() {
        Property<String> property = mock(Property.class);
        propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(property);
        verify(property, times(1)).setParent(any());
    }

}