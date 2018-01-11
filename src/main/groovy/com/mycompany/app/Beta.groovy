package com.mycompany.app;

import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.Bucket;
import java.util.List;

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

        //if (mickey.indexOf(
        //  '4444444444444444444444444444444444444444444444444444444444') < 0) {
    	  //error "red rover3 ${TEST_STACK_IP}:8080/green/timer/status $mickey" 
        //}
        
        def minnie = [
            "curl",
            "http://www.clarabridge.com"]
            .execute().text
        println minnie    

String bucket_name = 'deleteme1001'
final AmazonS3 s3 = AmazonS3ClientBuilder.defaultClient();
Bucket b = null;
if (s3.doesBucketExist(bucket_name)) {
    System.out.format("Bucket %s already exists.\n", bucket_name);
    b = getBucket(bucket_name);
} else {
    try {
        b = s3.createBucket(bucket_name);
    } catch (AmazonS3Exception e) {
        System.err.println(e.getErrorMessage());
    }
}
//return b;
        
        System.exit(0)
    }
}
