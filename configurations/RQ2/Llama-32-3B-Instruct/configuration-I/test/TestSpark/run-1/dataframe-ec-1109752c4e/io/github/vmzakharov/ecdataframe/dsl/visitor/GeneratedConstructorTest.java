package io.github.vmzakharov.ecdataframe.dsl.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedConstructorTest {

    @Test
    public void constructorTest() {
        PrettyPrintVisitor visitor = new PrettyPrintVisitor();
        assertNotNull(visitor);
    }

}