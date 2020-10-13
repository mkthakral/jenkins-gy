package com.gy
import com.gy.utility

def stopServer(String configFile) {
    String osName = new utility().getgetOS();
    println "OS Name: " + osName

    Properties props = new Properties()
    File propsFile = new File('./conf' + configFile + '.properties')
    props.load(propsFile.newDataInputStream())

    println props.getProperty('hybris-workspace')
}

