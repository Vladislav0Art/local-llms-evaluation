package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.properties.Property;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAdd_propertyNull_exceptionThrown {

    @Mock
    private Property property;

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setUp() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void add_propertyNull_exceptionThrown() {
        try {
            propertyListBuilder.add(null);
            assertTrue(false);
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }

}