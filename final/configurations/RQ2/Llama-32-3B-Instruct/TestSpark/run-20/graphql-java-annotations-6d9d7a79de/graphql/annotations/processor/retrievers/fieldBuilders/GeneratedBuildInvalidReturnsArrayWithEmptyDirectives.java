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

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedBuildInvalidReturnsArrayWithEmptyDirectives {

    @Test
    public void buildInvalidReturnsArrayWithEmptyDirectives() {
        AnnotatedElement object = Mockito.mock(AnnotatedElement.class);
        ProcessingElementsContainer container = Mockito.mock(ProcessingElementsContainer.class);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        try {
            Assertions.assertEquals(new GraphQLDirective[0], directivesBuilder.build());
        } catch (Exception e) {
            fail("Expected no exception");
        }
    }

}

class Builder {
    private AnnotatedElement object;
    private ProcessingElementsContainer container;

    public Builder(AnnotatedElement object, ProcessingElementsContainer container) throws Exception {
        if (object == null || container == null) {
            throw new Exception();
        }
        this.object = object;
        this.container = container;
    }

    public GraphQLDirective[] build() throws Exception {
        return new GraphQLDirective[0];
    }
}

class DirectiveJavaAnnotationUtil {

    public static GraphQLDirective getDirective() {
        return new GraphQLDirective();
    }

}