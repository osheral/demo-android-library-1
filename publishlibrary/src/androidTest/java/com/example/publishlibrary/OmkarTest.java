package com.example.publishlibrary;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by omkars on 06/04/17.
 */
public class OmkarTest {
  @Test
  public void foo() throws Exception {
    Omkar omkar = new Omkar();
    Assert.assertEquals(234234, omkar.foo());
  }

}