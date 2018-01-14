package com.mycompany.app;
import com.amazonaws.regions.Region
import com.amazonaws.regions.Regions

import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.Bucket;
import java.util.List;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3ObjectSummary;


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
 /*       
        def minnie = [
            "curl",
            "http://www.clarabridge.com"]
            .execute().text
        println minnie    
*/
String bucket_name = 'deleteme1001'
//bucket_name = 'pcf-east-io-aws-broker-778a5f30-e73b-4e67-8139-ff7de4d51e3c'
/* succeeds:
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
*/
/* Download an object (yes, this code works):
String key_name = 'deleteme1002'
final AmazonS3 s3 = AmazonS3ClientBuilder.defaultClient();
try {
    S3Object o = s3.getObject(bucket_name, key_name);
    S3ObjectInputStream s3is = o.getObjectContent();
    FileOutputStream fos = new FileOutputStream(new File(key_name));
    byte[] read_buf = new byte[1024];
    int read_len = 0;
    while ((read_len = s3is.read(read_buf)) > 0) {
        fos.write(read_buf, 0, read_len);
    }
    s3is.close();
    fos.close();
} catch (AmazonServiceException e) {
    System.err.println(e.getErrorMessage());
    System.exit(1);
} catch (FileNotFoundException e) {
    System.err.println(e.getMessage());
    System.exit(1);
} catch (IOException e) {
    System.err.println(e.getMessage());
    System.exit(1);
}
*/

/*
Region usWest2 = com.amazonaws.regions.Region.getRegion(Regions.US_WEST_2);
String r = "us-west-2"
//fails: final AmazonS3 s3 = AmazonS3ClientBuilder.withRegion(r).defaultClient();
//s3.setRegion(usWest2)
AmazonS3 s3 = 
        AmazonS3ClientBuilder.standard()
                             .withRegion("us-west-2") // The first region to try your request against
                            // .withForceGlobalBucketAccess(true) // If a bucket is in a different region, try again in the correct region
                             .build();
ObjectListing ol = s3.listObjects(bucket_name);
List<S3ObjectSummary> objects = ol.getObjectSummaries();
for (S3ObjectSummary os: objects) {
    System.out.println("* " + os.getKey());
}
*/

        def saynext = [
          "curl",  
          "http://saynext.redf4rth.net:8080/my-starter-app/prompt/font"]
         .execute().text
        
        println saynext

        println "kansas"
        
        def geoserver = [
          "curl",  
          "http://geoserver.redf4rth.net/geoserver/web"]
         .execute().text
        
        println geoserver

        println "indiana"
        
        System.exit(0)
    }
}
