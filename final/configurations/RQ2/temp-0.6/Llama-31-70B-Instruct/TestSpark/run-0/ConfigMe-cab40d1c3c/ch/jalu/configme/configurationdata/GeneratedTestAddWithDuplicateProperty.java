package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestAddWithDuplicateProperty {

    private static final String PROPERTY_PATH = "DataSource.mysql";
    private static final String[] PATHS = PROPERTY_PATH.split("\\.");

    @Mock
    private Property<String> mockProperty;

    @Test
    public void testAddWithDuplicateProperty() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(mockProperty);
        propertyListBuilder.add(mockProperty);
    }

}