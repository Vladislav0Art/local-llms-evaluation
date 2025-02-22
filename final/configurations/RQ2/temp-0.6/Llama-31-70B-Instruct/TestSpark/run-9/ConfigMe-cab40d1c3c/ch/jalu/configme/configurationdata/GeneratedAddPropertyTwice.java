package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import ch.jalu.configme.properties.PropertyImpl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddPropertyTwice {

    private PropertyListBuilder propertyListBuilder;

    @Mock
    private Property<?> mockProperty;

    @Before
    public void setup() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void addPropertyTwice() {
        when(mockProperty.getPath()).thenReturn("DataSource.mysql");
        propertyListBuilder.add(mockProperty);
        propertyListBuilder.add(mockProperty);
    }

}