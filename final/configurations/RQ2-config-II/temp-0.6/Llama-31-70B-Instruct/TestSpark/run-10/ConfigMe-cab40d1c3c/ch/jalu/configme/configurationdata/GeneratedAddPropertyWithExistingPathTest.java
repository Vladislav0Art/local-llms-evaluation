package ch.jalu.configme.configurationdata;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedAddPropertyWithExistingPathTest {

    @Test
    public void addPropertyWithExistingPathTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property = mock(Property.class);
        when(property.getPath()).thenReturn("DataSource.mysql");
        builder.add(property);
        builder.add(property);
    }

}