package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetRootEntries {

    private PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

    @Mock
    private ch.jalu.configme.configurationdata.Property property;

    @Test
    public void getRootEntries() {
        Map<String, Object> map = new LinkedHashMap<>();
        when(property.toString()).thenReturn("test");
        List<ch.jalu.configme.configurationdata.Property> properties = new ArrayList<>();
        properties.add(property);
        when(ch.jalu.configme.configurationdata.PropertyListBuilder.create()).thenReturn(properties);
        Map<String, Object> actual = propertyListBuilder.getRootEntries();
        assertEquals(map, actual);
    }

}