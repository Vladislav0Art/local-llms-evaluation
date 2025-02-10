package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreateListWithSingleProperty {

    private PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

    @Mock
    private ch.jalu.configme.configurationdata.Property property;

    @Test
    public void createListWithSingleProperty() {
        List<ch.jalu.configme.configurationdata.Property> expected = new ArrayList<>();
        expected.add(property);
        when(property.toString()).thenReturn("test");
        assertEquals(expected, propertyListBuilder.create());
    }

}