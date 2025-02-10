package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddNullProperty {

    private PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

    @Mock
    private ch.jalu.configme.configurationdata.Property property;

    @Test
    public void addNullProperty() {
        assertThrows(ConfigMeException.class, () -> propertyListBuilder.add(null));
    }

}