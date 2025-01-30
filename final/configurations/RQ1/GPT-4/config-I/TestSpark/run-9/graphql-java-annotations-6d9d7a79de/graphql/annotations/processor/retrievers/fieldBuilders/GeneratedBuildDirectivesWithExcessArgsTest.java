package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static graphql.schema.GraphQLDirective.newDirective;

public class GeneratedBuildDirectivesWithExcessArgsTest {

    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void buildDirectivesWithExcessArgsTest() {
        Annotation mockAnnotation = Mockito.mock(Annotation.class);
        AnnotatedElement mockAnnotatedElement = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer mockContainer = Mockito.mock(ProcessingElementsContainer.class);

        ArrayList<Annotation> annotations = new ArrayList<>();
        annotations.add(mockAnnotation);
        Mockito.when(mockAnnotatedElement.getAnnotation(mockAnnotation.getClass())).thenReturn(mockAnnotation);
        Mockito.when(DirectiveJavaAnnotationUtil.getDirectiveAnnotations(mockAnnotatedElement)).thenReturn(annotations);
        Mockito.when(DirectiveJavaAnnotationUtil.getName(mockAnnotation)).thenReturn("MockDirective");

        mockDirectiveRegistryWithMockDirective(mockContainer);

        DirectivesBuilder builder = new DirectivesBuilder(mockAnnotatedElement, mockContainer);

        expectedEx.expect(GraphQLAnnotationsException.class);
        expectedEx.expectMessage("Directive 'MockDirective' is supplied with more argument values than it supports");

        builder.build();
    }

}