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
public class GeneratedCreateWithPropertiesTest {

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

}