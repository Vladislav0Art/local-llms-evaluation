package ch.jalu.configme.configurationdata;

import org.junit.Test;
import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class GeneratedAddPropertyNullTest {

    @Test
    public void addPropertyNullTest() {
        Property propertyMock = mock(Property.class);
        when(propertyMock.getPath()).thenReturn(null);

        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(propertyMock);
    }

}