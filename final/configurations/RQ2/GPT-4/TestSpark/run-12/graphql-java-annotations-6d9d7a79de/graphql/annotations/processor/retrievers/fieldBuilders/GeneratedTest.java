package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLDirective;
import graphql.annotations.processor.ProcessingElementsContainer;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.reflect.Field;
import java.lang.reflect.AnnotatedElement;

public class GeneratedTest {

    @Test
    public void buildNullAnnotationTest() {
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        AnnotatedElement obj = Mockito.mock(AnnotatedElement.class);
        DirectivesBuilder builder = new DirectivesBuilder(obj, container);
        GraphQLDirective[] directives = builder.build();

        Assert.assertNotNull(directives);
        Assert.assertEquals(0, directives.length);
    }

    @Test
    public void buildWithInvalidAnnotationTest() {
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        AnnotatedElement obj = Mockito.mock(AnnotatedElement.class);
        DirectivesBuilder builder = new DirectivesBuilder(obj, container);
        builder.build();
    }

    @Test
    public void buildWithValidAnnotationTest() {
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        AnnotatedElement obj = Mockito.mock(AnnotatedElement.class);
        DirectivesBuilder builder = new DirectivesBuilder(obj, container);
        GraphQLDirective[] directives = builder.build();

        Assert.assertNotNull(directives);
    }

}