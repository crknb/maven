package com.xyc;

import junit.framework.Assert;
import org.junit.Test;

public class Test01 {
    @Test
    public void testSay(){
        Demo d = new Demo();
        String maven = d.say("MAVEN");
        Assert.assertEquals("helloMAVEN",maven);
    }
}
