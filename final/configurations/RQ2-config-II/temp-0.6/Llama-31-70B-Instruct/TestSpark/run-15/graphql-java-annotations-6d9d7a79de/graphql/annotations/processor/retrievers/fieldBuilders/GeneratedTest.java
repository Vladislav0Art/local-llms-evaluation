package graphql.annotations.processor.retrievers.fieldBuilders;

import static org.junit.Assert.assertEquals;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void publicConstructorTest() {
        AnnotatedElement object = null;
        ProcessingElementsContainer container = null;

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);

        assertEquals(object, directivesBuilder.object);
        assertEquals(container, directivesBuilder.container);
    }

    @Test
    public void buildWithInvalidMethodTest() throws Exception {
        Method method = DirectivesBuilder.class.getDeclaredMethod("build");
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(method, null);

        directivesBuilder.build();
    }

    @Test
    public void buildWithValidMethodTest() throws Exception {
        Method method = DirectivesBuilder.class.getDeclaredMethod("build");
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(method, null);

        GraphQLDirective[] directives = directivesBuilder.build();

        assertEquals(0, directives.length);
    }

}