#!/usr/bin/env groovy

package org.apache.commons.lang
public class StringUtils

def call(String filter_string, int occurance) {
    def logs = currentBuild.rawBuild.getlog(1000).join('\n')
    int count = StringUtils.countMatches(logs,filter_string);
    if (count>occurance-1){
        currentBuild.result='UNSTABLE'
    }
}
