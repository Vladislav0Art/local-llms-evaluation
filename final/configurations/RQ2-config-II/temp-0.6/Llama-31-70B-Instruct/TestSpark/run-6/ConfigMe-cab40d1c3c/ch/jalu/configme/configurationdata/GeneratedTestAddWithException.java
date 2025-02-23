package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedTestAddWithException {

    @Mock
    private Property testProperty;

    @Test
    public void testAddWithException() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(testProperty);
        propertyListBuilder.add(testProperty);
    }

}