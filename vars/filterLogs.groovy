#!/usr/bin/env groovy
# https://opensource.triology.de/jenkins/pipeline-syntax/globals
# Following code will check the warnings and based on occurnace it will set the status of the jfPipelines
package org.apache.commons.lang
public class StringUtils

def call(String filter_string, int occurrence){
    def buildLog  = currentBuild. rawBuild.log(1000).join(\n)
    def count = StringUtils.CountMatches(buildlog,filter_string)
    if (count > occurrence-1){
        currentBuild.result = 'UNSTABLE'
    }

}
