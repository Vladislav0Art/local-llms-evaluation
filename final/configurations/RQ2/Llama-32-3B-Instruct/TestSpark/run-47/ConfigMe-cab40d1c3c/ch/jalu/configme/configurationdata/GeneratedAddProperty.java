package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddProperty {

    private PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

    @Mock
    private ch.jalu.configme.configurationdata.Property property;

    @Test
    public void addProperty() {
        propertyListBuilder.add(property);
        Mockito.verify(property).toString();
    }

}