package com.oldratlee.cooma.ext1.impl;

import com.oldratlee.cooma.Config;
import com.oldratlee.cooma.ext1.Ext1;

/**
 * @author oldratlee
 */
public class Ext1Impl1 implements Ext1 {
    public String echo(Config config, String s) {
        return "Ext1Impl1-echo";
    }
    
    public String yell(Config config, String s) {
        return "Ext1Impl1-yell";
    }
    
    public String bang(Config config, int i) {
        return "bang1";
    }
}