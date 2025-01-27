package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedAddPropertyWithExistingNameThrowsException {

    @Test
    public void addPropertyWithExistingNameThrowsException() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> map = new LinkedHashMap<>();
        List<Property<?>> list = new ArrayList<>();

        when(builder.getRootEntries()).thenReturn(map);

        Property<?> property = new Property<>("name", "value");
        builder.add(property);
        assertTrue(builder.getRootEntries().containsKey("name"));
    }

}