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

        def test = [
          [ "http://saynext.redf4rth.net:8080/my-starter-app/prompt/font", /js>/ ],
          [ "http://geoserver.redf4rth.net/geoserver/web/", /org.geoserver.web.GeoServerBasePage/ ],
          [ "http://gocontainer.redf4rth.net:8080/green/timer/status",/4444444444/ ],
          [ "http://www.clarabridge.com", /301 Moved Permanently/]
        ]

        def iRecognize = []
        for (int i=0; i<test.size(); i++) {
         println "-------------------------start $i---------------"          
          def app = [
            "curl", "--max-time", "10",  
            test[i][0]
          ]
          .execute().text
          println app
          println "-------------------------end $i---------------"

          iRecognize[i] = (app =~ test[i][1] )
        }

        boolean rc = true
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
