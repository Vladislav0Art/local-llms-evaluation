package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.annotationTypes.directives.activation.GraphQLDirectives;
import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.exceptions.GraphQLAnnotationsException;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import graphql.schema.GraphQLDirective;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class GeneratedBuildTest_ExpectTwoDirectives_ReturnArrayWithTwoDirectives {

    @Test
    public void buildTest_ExpectTwoDirectives_ReturnArrayWithTwoDirectives() throws NoSuchMethodException {
        Method method = MyClassWithDirectives.class.getMethod("myMethod");
        ProcessingElementsContainer container = new ProcessingElementsContainer();

        DirectivesBuilder builder = new DirectivesBuilder(method, container);
        GraphQLDirective[] directives = builder.build();

        Assert.assertEquals(directives.length, 2);
    }

}