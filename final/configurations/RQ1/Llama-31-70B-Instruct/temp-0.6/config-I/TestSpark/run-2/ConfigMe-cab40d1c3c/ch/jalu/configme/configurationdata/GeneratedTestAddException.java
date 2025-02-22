package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedTestAddException {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setUp() throws Exception {
        propertyListBuilder = new PropertyListBuilder();
    }

    @After
    public void tearDown() throws Exception {
        propertyListBuilder = null;
    }

    @Test
    public void testAddException() {
        Property<?> property = mock(Property.class);
        propertyListBuilder.add(property);
        propertyListBuilder.add(property);
    }

}