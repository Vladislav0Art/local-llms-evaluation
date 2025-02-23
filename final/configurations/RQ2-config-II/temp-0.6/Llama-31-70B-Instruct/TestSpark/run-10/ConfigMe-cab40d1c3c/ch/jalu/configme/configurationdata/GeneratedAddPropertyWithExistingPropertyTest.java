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

public class GeneratedAddPropertyWithExistingPropertyTest {

    @Test
    public void addPropertyWithExistingPropertyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<String> property1 = mock(Property.class);
        when(property1.getPath()).thenReturn("DataSource.mysql.host");
        Property<String> property2 = mock(Property.class);
        when(property2.getPath()).thenReturn("DataSource.mysql");
        builder.add(property1);
        builder.add(property2);
    }

}