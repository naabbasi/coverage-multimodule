package edu.learn.backend;

import org.junit.Assert;
import org.junit.Test;

public class BackendTest {

    @Test
    public void create() {
        Assert.assertEquals("Created", new Backend().create());;
    }

    @Test
    public void retrieve() {
        Assert.assertEquals("Retrieved", new Backend().retrieve());
    }

    @Test
    public void update() {
        Assert.assertEquals("Updated", new Backend().update());
    }

    @Test
    public void delete() {
        Assert.assertEquals("Deleted", new Backend().delete());
    }
}
