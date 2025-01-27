package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAdd_AddsSingleProperty_ReturnsUpdatedList {

    @Mock
    private List<Property<?>> properties;

    @Test
    public void add_AddsSingleProperty_ReturnsUpdatedList() {
        new PropertyListBuilder()
                .add(new Property<String>("key", "value"))
                .create()
                .forEach(property -> assertEquals("key", property.getKey()));
    }

}