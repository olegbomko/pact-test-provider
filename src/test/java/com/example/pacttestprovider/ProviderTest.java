package com.example.pacttestprovider;

import au.com.dius.pact.provider.junit.PactRunner;
import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.loader.PactFolder;
import au.com.dius.pact.provider.junit.target.HttpTarget;
import au.com.dius.pact.provider.junit.target.Target;
import au.com.dius.pact.provider.junit.target.TestTarget;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.web.context.ConfigurableWebApplicationContext;

/**
 * Created by Oleg Bomko on 12/06/2018.
 */
@RunWith(PactRunner.class)
@Provider("test_provider")
@PactFolder("/home/oleg/work/pact-test-consumer/target/pacts")
public class ProviderTest {

    @TestTarget
    public final Target target = new HttpTarget("http", "localhost", 8082, "/");

    private static ConfigurableWebApplicationContext application;

    @BeforeClass
    public static void start() {
        application = (ConfigurableWebApplicationContext)
                SpringApplication.run(PactTestProviderApplication.class);
    }

    @State("Test Hello Provider Service")
    public void toGetState() { }


}
