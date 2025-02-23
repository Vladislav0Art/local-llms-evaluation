package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddPropertyWithDuplicatePathTest {

    private PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

    @Test
    public void addPropertyWithDuplicatePathTest() {
        Property property = Mockito.mock(Property.class);
        Mockito.when(property.getPath()).thenReturn("DataSource.mysql");

        propertyListBuilder.add(property);
        propertyListBuilder.add(property);
    }

}