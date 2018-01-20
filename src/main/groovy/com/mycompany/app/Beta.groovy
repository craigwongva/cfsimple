package com.mycompany.app;

public class Beta 
{
    public static void main( String[] args )
    {

        def test = [
          [ "http://saynext.redf4rth.net:8080/my-starter-app/prompt/font", /js>/ ],
          [ "http://geoserver.redf4rth.net/geoserver/web/", /org.geoserver.web.GeoServerBasePage/ ],
          [ "http://gocontainer.redf4rth.net:8080/green/timer/status",/4444444444/ ],
          [ "http://tegola.redf4rth.net:8081/envelope2/envelope/sphere", /new ol.layer.VectorTile/],
          [ "http://www.clarabridge.com", /301 Moved Permanently/],
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
