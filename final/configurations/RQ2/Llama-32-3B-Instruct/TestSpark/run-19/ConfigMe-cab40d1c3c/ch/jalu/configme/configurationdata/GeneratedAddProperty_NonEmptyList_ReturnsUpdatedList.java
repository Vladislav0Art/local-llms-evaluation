package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddProperty_NonEmptyList_ReturnsUpdatedList {

    @Mock
    private List<Property<?>> properties;

    @Test
    public void addProperty_NonEmptyList_ReturnsUpdatedList() {
        ArrayList<Property<?>> props = new ArrayList<>();
        props.add(Mockito.mock(Property.class));
        when(properties.isEmpty()).thenReturn(false);
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(Mockito.mock(Property.class));
        assertEquals(2, ((ArrayList<Property<?>>) properties).size());
    }

}