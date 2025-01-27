package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class GeneratedAddNullProperty_ThrowsException {

    @Test
    public void addNullProperty_ThrowsException() {
        // Arrange
        PropertyListBuilder builder = new PropertyListBuilder();

        // Act
        builder.add(null);
    }

}