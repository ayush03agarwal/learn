package com.dropwizzard;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class DemoApplication extends Application<DemoConfiguration> {

    public static void main(String[] args) throws Exception {
        new DemoApplication().run(new String[] {"server", "/Users/ayush.agarwal/code/learning/learn/src/main/resources/config.yml"});
    }

    @Override
    public void run(DemoConfiguration configuration, Environment environment) {
        final DemoResource resource = new DemoResource(configuration.getMessage(),
                configuration.getFirstParameter(), configuration.getSecondParameter());
        environment.jersey().register(resource);
    }
}
