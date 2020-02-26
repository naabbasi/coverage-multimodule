package edu.learn.backend;

import org.junit.Test;

public class BackendTest {

    @Test
    public void create() {
        new Backend().create();
    }

    @Test
    public void retrieve() {
        new Backend().retrieve();
    }

    @Test
    public void update() {
        new Backend().update();
    }

    @Test
    public void delete() {
        new Backend().delete();
    }
}
