package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.schema.GraphQLDirective;
import graphql.annotations.processor.ProcessingElementsContainer;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.AnnotatedElement;

import graphql.annotations.annotationTypes.GraphQLDirective;
import org.mockito.Mockito;

import java.lang.reflect.Field;

public class GeneratedBuildTest_WithDirectives {

    @Test
    public void buildTest_WithDirectives() {
        AnnotatedElement object = AnnotatedElement.class;
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        GraphQLDirective directive = new GraphQLDirective();
        container.registerDirective(directive);
        DirectivesBuilder directivesBuilder = new DirectivesBuilder(object, container);
        GraphQLDirective[] result = directivesBuilder.build();
        Assert.assertNotNull(result);
        Assert.assertEquals(1, result.length);
        Assert.assertEquals(directive, result[0]);
    }

}