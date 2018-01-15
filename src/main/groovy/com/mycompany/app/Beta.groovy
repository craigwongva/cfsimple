package com.mycompany.app;

public class Beta 
{
    public static void main( String[] args )
    {
        //def mickey = [
        //  "curl",  
        //  "${TEST_STACK_IP}:8080/green/timer/status"]
        // .execute().text
        def ARBITRARY_SUCCESS_PCT = 0.95
        def NUM_GREEN_DOTS = 100
        def GREEN_DOT_STATUS_DONE = '4'

        //Groovy notes:
        //fails: 
        // if (mickey.indexOf(
        //   GREEN_DOT_STATUS_DONE.multiply(
        //     ARBITRARY_SUCCESS_PCT*NUM_GREEN_DOTS)) < 0) { }
        //succeeds: 
        // if (mickey.indexOf('4'.multiply(95)) < 0) { }

        //if (mickey.indexOf(
        //  '4444444444444444444444444444444444444444444444444444444444') < 0) {
    	  //error "red rover3 ${TEST_STACK_IP}:8080/green/timer/status $mickey" 
        //}

        def DEFAULT_PAUSE_FOR_USERDATA_COMPLETION = 30*60 //that's 30m
        def test = [
          [ "http://saynext.redf4rth.net:8080/my-starter-app/prompt/font", /js>/ ],
          [ "http://geoserver.redf4rth.net/geoserver/web/", /org.geoserver.web.GeoServerBasePage/ ],
        ]

        def env = System.getenv()
        if (env['PAUSE_FOR_USERDATA_COMPLETION']) {
          println "Groovy is pausing: ${env['PAUSE_FOR_USERDATA_COMPLETION']}"
          println "aaa"
          sleep 1000*env['PAUSE_FOR_USERDATA_COMPLETION'].toInteger()
          println "bbb"
        }
        else {
          println "Groovy is pausing the default $DEFAULT_PAUSE_FOR_USERDATA_COMPLETION"
          sleep 1000*DEFAULT_PAUSE_FOR_USERDATA_COMPLETION
        }
        println "ccc"
        def phantom = [
            "gocontainer-phantom-public/ubuntu/invoke-phantom", "52.10.249.201"//,
//          "BUILD_ID=dontKillMe",
//          "bash", "-c",
//          "'cd gocontainer-phantom-public/ubuntu;",
//          "./invoke-phantom",
//          "52.10.249.201",
//            "&"

//            "ls", "gocontainer-phantom-public/ubuntu"
        ]
        .execute().text
        sleep 1000*10
        println "como no se ve"
//        println phantom
        println "empieza su semana"
        def phantom2 = [
          "/usr/bin/phantomjs",
          "gocontainer-phantom-public/ubuntu/invoke-phantom.js",
          "&"
        ].execute().text
        println "una sonrisa anaranja"
        println phantom2
        println "una sonrisa azul"
        
        def iRecognize = []
        for (int i=0; i<test.size(); i++) {
          println i
          def app = [
            "curl", "--max-time 10",  
            test[i][0]
          ]
//          .execute().text
        
          iRecognize[i] = true //(app =~ test[i][1] )
        }
        println "ddd"
        boolean rc = true //iRecognize[0] && iRecognize[1]
        for (int i=0; i<test.size(); i++) {
          boolean b = iRecognize[i]
          println "$b ${test[i][0]}"
          rc = rc && b 
        }

        if (rc) {
          System.exit(0)
        }
        else {
          System.exit(-1)
        }
    }
}
