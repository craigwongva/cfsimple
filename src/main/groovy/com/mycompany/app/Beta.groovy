package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class Beta 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        println "A dog barks"
        
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

        if (mickey.indexOf(
          '4444444444444444444444444444444444444444444444444444444444') < 0) {
    	  //error "red rover3 ${TEST_STACK_IP}:8080/green/timer/status $mickey" 
        }
        
        def minnie = [
            "curl",
            "http://www.clarabridge.com"]
            .execute().text
        println minnie    
        
        System.exit(0)
    }
}
