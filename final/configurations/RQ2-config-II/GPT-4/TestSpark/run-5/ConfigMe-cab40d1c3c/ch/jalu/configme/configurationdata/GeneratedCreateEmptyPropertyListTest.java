package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedCreateEmptyPropertyListTest {

    @Test
    public void createEmptyPropertyListTest() {
        PropertyListBuilder listBuilder = new PropertyListBuilder();
        List<Property<?>> propertyList = listBuilder.create();

        assertTrue("Properties List should be empty", propertyList.isEmpty());
    }

}