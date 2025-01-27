package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedAddProperty_ThrowsExceptionWhenAddingNullProperty {

    @Test
    public void addProperty_ThrowsExceptionWhenAddingNullProperty() {
        List<Property<?>> properties = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        expectThrow(ConfigMeException.class, () -> builder.addProperty(null));
    }

}