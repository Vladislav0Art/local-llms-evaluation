package graphql.annotations.processor.retrievers.fieldBuilders;

import static org.junit.Assert.assertEquals;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

import org.junit.Test;

public class GeneratedPublicConstructorTest {

    @Test
    public void publicConstructorTest() {
        AnnotatedElement object = null;
        ProcessingElementsContainer container = null;

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);

        assertEquals(object, directivesBuilder.object);
        assertEquals(container, directivesBuilder.container);
    }

}