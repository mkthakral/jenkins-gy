package com.gy
import com.gy.utility

def stopServer(String environment) {
    String osName = new utility().getOS();
    println "OS Name: " + osName

    def propFileContent = libraryResource environment + '.properties'
    println propFileContent
    def props = readProperties text: propFileContent
    println props['hybris-workspace']

    Properties props = new Properties()
    File propsFile = new File('./conf/' + environment + '.properties')
    props.load(propsFile.newDataInputStream())

    println props.getProperty('hybris-workspace')
}

