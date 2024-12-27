package graphql.annotations.processor.retrievers.fieldBuilders;

import graphql.annotations.processor.ProcessingElementsContainer;
import graphql.annotations.processor.retrievers.fieldBuilders.DirectivesBuilder;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.AnnotatedElement;

import graphql.annotations.processor.DirectivesBuilder;
import graphql.schema.GraphQLDirective;
import graphql.annotations.annotationTypes.GraphQLDirective;
import org.mockito.Mockito;

import java.lang.reflect.Field;

public class GeneratedBuild_WhenNoDirectives_Test {

    class DirectivesBuilderExtended extends DirectivesBuilder {

        private boolean isDirectiveSet = false;

        public DirectivesBuilderExtended(AnnotatedElement object, ProcessingElementsContainer container) {
            super(object, container);
        }

        @Override
        public GraphQLDirective[] build() {
            return isDirectiveSet ? new GraphQLDirective[1] : new GraphQLDirective[0];
        }

        public void setDirective() {
            isDirectiveSet = true;
        }
    }

    @Test
    public void build_WhenNoDirectives_Test() {
        AnnotatedElement object = AnnotatedElement.class;
        ProcessingElementsContainer container = new ProcessingElementsContainer();
        DirectivesBuilderExtended directivesBuilder = new DirectivesBuilderExtended(object, container);

        Assert.assertNotNull(directivesBuilder.build());
        Assert.assertEquals(0, directivesBuilder.build().length);
    }

}