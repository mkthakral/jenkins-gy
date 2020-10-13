package com.gy
import com.gy.utility

def stopServer(String environment) {
    String osName = new utility().getOS();
    println "OS Name: " + osName

    def propFileContent = libraryResource environment + '.properties'
    println propFileContent
    def propertyFile = readProperties text: propFileContent
    println propertyFile['hybris-workspace']

}

