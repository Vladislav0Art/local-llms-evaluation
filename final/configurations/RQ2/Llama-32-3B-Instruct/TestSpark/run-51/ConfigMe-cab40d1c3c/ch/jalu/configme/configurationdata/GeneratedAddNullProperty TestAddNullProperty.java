package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedAddNullProperty TestAddNullProperty {

    @Test
    public void addNullProperty

    TestAddNullProperty() {
        // Assert
        assertThrows(ConfigMeException.class, () -> PropertyListBuilder.getInstance().add(null));
    }

}