package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void addPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        try {
            Property mockProperty = Mockito.mock(Property.class);
            propertyListBuilder.add(mockProperty);
            assertNotNull(propertyListBuilder.create());
        } catch (Exception exception) {
            fail("Test failed with exception: " + exception.getMessage());
        }
    }

    @Test
    public void createEmptyListTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        try {
            assertTrue(propertyListBuilder.create().isEmpty());
        } catch (Exception exception) {
            fail("Test failed with exception: " + exception.getMessage());
        }
    }

    @Test
    public void createWithPropertiesTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        try {
            Property mockProperty = Mockito.mock(Property.class);
            propertyListBuilder.add(mockProperty);
            assertTrue(propertyListBuilder.create().contains(mockProperty));
        } catch (Exception exception) {
            fail("Test failed with exception: " + exception.getMessage());
        }
    }

    @Test
    public void getRootEntriesTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        try {
            assertNotNull(propertyListBuilder.getRootEntries());
            assertTrue(propertyListBuilder.getRootEntries().isEmpty());
        } catch (Exception exception) {
            fail("Test failed with exception: " + exception.getMessage());
        }
    }

    @Test
    public void getRootEntriesWithPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        try {
            Property mockProperty = Mockito.mock(Property.class);
            Mockito.when(mockProperty.getPath()).thenReturn("testPath");
            Mockito.when(mockProperty.getDefaultValue()).thenReturn("testValue");
            propertyListBuilder.add(mockProperty);
            assertTrue(propertyListBuilder.getRootEntries().containsValue("testValue"));
            assertTrue(propertyListBuilder.getRootEntries().containsKey("testPath"));
        } catch (Exception exception) {
            fail("Test failed with exception: " + exception.getMessage());
        }
    }

}