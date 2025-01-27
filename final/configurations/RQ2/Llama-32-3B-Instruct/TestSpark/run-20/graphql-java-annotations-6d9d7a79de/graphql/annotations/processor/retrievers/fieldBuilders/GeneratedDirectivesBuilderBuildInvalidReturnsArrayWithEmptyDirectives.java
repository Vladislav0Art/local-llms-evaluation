package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.util.DirectiveJavaAnnotationUtil;
import graphql.schema.GraphQLArgument;
import graphql.schema.GraphQLDirective;
import graphql.schema.GraphQLScalarType;
import graphql.schema.GraphQLType;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedDirectivesBuilderBuildInvalidReturnsArrayWithEmptyDirectives {

    @Test
    public void DirectivesBuilderBuildInvalidReturnsArrayWithEmptyDirectives() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        GraphQLDirective[] directives = {};
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        directivesBuilder.build();
        assertEquals(0, directivesBuilder.getDirectives().length);
    }

}

class Builder {
    private AnnotatedElement object;
    private ProcessingElementsContainer container;

    public Builder(AnnotatedElement object, ProcessingElementsContainer container) {
        this.object = object;
        this.container = container;
    }

    public GraphQLDirective[] build() {
        // implementation
        return new GraphQLDirective[0];
    }

    public List<GraphQLDirective> getDirectives() {
        return Arrays.asList(new DirectiveJavaAnnotationUtil().getDirectives(this.object, this.container));
    }

}