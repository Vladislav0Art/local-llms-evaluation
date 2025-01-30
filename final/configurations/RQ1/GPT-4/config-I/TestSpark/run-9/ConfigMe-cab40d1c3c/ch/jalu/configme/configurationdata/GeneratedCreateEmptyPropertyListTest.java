package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedCreateEmptyPropertyListTest {

    @Test
    public void createEmptyPropertyListTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        assertTrue(propertyListBuilder.create().isEmpty());
    }

}