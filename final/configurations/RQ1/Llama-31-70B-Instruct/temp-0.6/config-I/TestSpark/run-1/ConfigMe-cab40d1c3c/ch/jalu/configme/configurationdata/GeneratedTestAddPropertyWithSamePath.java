package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedTestAddPropertyWithSamePath {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setUp() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void testAddPropertyWithSamePath() {
        Property<?> property1 = mock(Property.class);
        when(property1.getPath()).thenReturn("test");

        Property<?> property2 = mock(Property.class);
        when(property2.getPath()).thenReturn("test");

        propertyListBuilder.add(property1);
        assertThrows(ConfigMeException.class, () -> propertyListBuilder.add(property2));
    }

}