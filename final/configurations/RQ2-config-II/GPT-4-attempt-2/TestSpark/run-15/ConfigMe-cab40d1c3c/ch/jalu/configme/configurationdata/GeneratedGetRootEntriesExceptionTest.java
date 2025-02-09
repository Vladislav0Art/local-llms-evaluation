package ch.jalu.configme.configurationdata;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.doNothing;

public class GeneratedGetRootEntriesExceptionTest {

    @Test
    public void getRootEntriesExceptionTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property mockProperty = Mockito.mock(Property.class);
        propertyListBuilder.add(mockProperty);

        propertyListBuilder.getRootEntries();
    }

}