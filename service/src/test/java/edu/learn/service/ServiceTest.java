package edu.learn.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class ServiceTest {

    @Test
    public void hello() {
        new Service().hello();
    }

    @Test
    public void world() {
        new Service().world();
    }
}
