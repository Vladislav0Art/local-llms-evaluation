package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

public class GeneratedTest {

    @Test
    public void buildNullObjectTest() {
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(null, container);
        directivesBuilder.build();
    }

    @Test
    public void buildEmptyMethodAnnotationsTest() {
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        Method annotatedElement = Mockito.mock(Method.class);
        Mockito.when(annotatedElement.getAnnotations()).thenReturn(new Annotation[0]);

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(annotatedElement, container);
        GraphQLDirective[] directives = directivesBuilder.build();

        Assert.assertNotNull(directives);
        // Array should be empty as there are no Annotations in the Method
        Assert.assertEquals(0, directives.length);
    }

    @Test
    public void buildGraphQLDirectivesTest() {
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        Annotation annotation = Mockito.mock(GraphQLDirectives.class);
        Method annotatedElement = Mockito.mock(Method.class);
        Mockito.when(annotatedElement.getAnnotations()).thenReturn(new Annotation[]{annotation});

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(annotatedElement, container);
        GraphQLDirective[] directives = directivesBuilder.build();

        Assert.assertNotNull(directives);
    }

    @Test
    public void buildNonGraphQLDirectivesTest() {
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        Annotation annotation = Mockito.mock(Override.class);
        Method annotatedElement = Mockito.mock(Method.class);
        Mockito.when(annotifiedElement.getAnnotations()).thenReturn(new Annotation[]{annotation});

        DirectivesBuilder directivesBuilder = new DirectivesBuilder(annotatedElement, container);
        GraphQLDirective[] directives = directivesBuilder.build();

        Assert.assertNotNull(directives);
        // Array should be empty as the @Override annotation is not a GraphQLDirective
        Assert.assertEquals(0, directives.length);
    }

}